package be.bastinjul.testspringwebflux.repositories;

import be.bastinjul.entities.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
}
