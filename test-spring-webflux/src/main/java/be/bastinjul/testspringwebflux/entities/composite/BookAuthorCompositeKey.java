package be.bastinjul.testspringwebflux.entities.composite;

import java.io.Serializable;
import java.util.Objects;

public class BookAuthorCompositeKey implements Serializable {

    private Long bookId;
    private Long authorId;

    public BookAuthorCompositeKey() {
        //needed for db
    }

    public BookAuthorCompositeKey(Long bookId, Long authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookAuthorCompositeKey that = (BookAuthorCompositeKey) o;
        return bookId.equals(that.bookId) && authorId.equals(that.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, authorId);
    }
}
