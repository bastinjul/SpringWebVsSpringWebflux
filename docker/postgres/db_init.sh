#!/bin/bash

set -e
set -u

function create_db() {
    local database=$1
    echo "Creating database '${database}'"
    psql -v ON_ERROR_STOP=1 --username "${POSTGRES_USER}" <<-EOSQL
        CREATE USER $database WITH PASSWORD '$database';
        CREATE DATABASE $database;
        GRANT ALL PRIVILEGES ON DATABASE $database to $database;

EOSQL

    PGPASSWORD="${database}" psql -v ON_ERROR_STOP=1 --username="${database}" --dbname="${database}" <<- EOSQL
        create table if not exists author
        (
            id bigserial primary key,
            birth_date timestamp    not null,
            death_date timestamp,
            firstname  varchar(255) not null,
            lastname   varchar(255) not null
        );

        create table if not exists book
        (
            id bigserial primary key,
            name    varchar(255) not null,
            summary varchar(255) not null
        );

        create table if not exists book_author
        (
            author_id bigint not null,
            book_id   bigint not null,
            primary key (author_id, book_id)
        );
EOSQL
}

if [ -n "${DATABASES}" ]; then
    echo "Creating databases : ${DATABASES}"
    for db in $(echo "${DATABASES}" | tr ',' ' '); do
      create_db "${db}"
    done
fi