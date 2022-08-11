package be.bastinjul.testspringwebflux.repositories;

import be.bastinjul.entities.BookAuthor;
import be.bastinjul.entities.composite.BookAuthorCompositeKey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookAuthorRepository extends ReactiveCrudRepository<BookAuthor, BookAuthorCompositeKey> {
}
