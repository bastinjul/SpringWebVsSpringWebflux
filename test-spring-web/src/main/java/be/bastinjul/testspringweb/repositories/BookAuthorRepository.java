package be.bastinjul.testspringweb.repositories;

import be.bastinjul.entities.BookAuthor;
import be.bastinjul.entities.composite.BookAuthorCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, BookAuthorCompositeKey> {
}
