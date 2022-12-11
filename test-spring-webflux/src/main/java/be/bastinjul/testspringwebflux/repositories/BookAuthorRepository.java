package be.bastinjul.testspringwebflux.repositories;

import be.bastinjul.testspringwebflux.entities.BookAuthor;
import be.bastinjul.testspringwebflux.entities.composite.BookAuthorCompositeKey;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAuthorRepository extends R2dbcRepository<BookAuthor, BookAuthorCompositeKey> {
}
