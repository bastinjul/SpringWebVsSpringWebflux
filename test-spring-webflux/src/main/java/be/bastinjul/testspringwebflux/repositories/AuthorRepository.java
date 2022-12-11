package be.bastinjul.testspringwebflux.repositories;

import be.bastinjul.testspringwebflux.entities.Author;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends R2dbcRepository<Author, Long> {
}
