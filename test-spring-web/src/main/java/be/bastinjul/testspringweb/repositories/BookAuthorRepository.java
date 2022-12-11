package be.bastinjul.testspringweb.repositories;

import be.bastinjul.testspringweb.entities.BookAuthor;
import be.bastinjul.testspringweb.entities.composite.BookAuthorCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, BookAuthorCompositeKey> {
}
