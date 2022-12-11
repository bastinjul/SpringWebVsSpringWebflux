package be.bastinjul.testspringwebflux.entities;

import be.bastinjul.testspringwebflux.entities.composite.BookAuthorCompositeKey;

import javax.persistence.*;

@Entity
@Table(name = "book_author")
@IdClass(BookAuthorCompositeKey.class)
public class BookAuthor {

    @Id
    @Column(name = "book_id")
    private Long bookId;

    @Id
    @Column(name = "author_id")
    private Long authorId;

    public BookAuthor() {
        //needed for db
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}
