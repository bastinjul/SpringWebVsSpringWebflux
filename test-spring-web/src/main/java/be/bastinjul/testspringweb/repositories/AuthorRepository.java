package be.bastinjul.testspringweb.repositories;

import be.bastinjul.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
