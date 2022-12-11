package be.bastinjul.testspringweb.repositories;

import be.bastinjul.testspringweb.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
