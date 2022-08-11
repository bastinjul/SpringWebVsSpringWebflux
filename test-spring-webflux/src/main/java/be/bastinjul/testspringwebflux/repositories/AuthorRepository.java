package be.bastinjul.testspringwebflux.repositories;

import be.bastinjul.entities.Author;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AuthorRepository extends ReactiveCrudRepository<Author, Long> {
}
