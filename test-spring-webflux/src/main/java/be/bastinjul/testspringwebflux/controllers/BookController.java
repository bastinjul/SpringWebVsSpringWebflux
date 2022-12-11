package be.bastinjul.testspringwebflux.controllers;

import be.bastinjul.testspringwebflux.entities.Book;
import be.bastinjul.testspringwebflux.repositories.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Tag(name = "Book controller")
@RequestMapping(path = "/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Operation
    @GetMapping("/{id}")
    @ResponseBody
    public Mono<Book> bookById(@PathVariable("id") Long id) {
        return bookRepository.findById(id);
    }

    @Operation
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> postBook(@RequestBody Mono<Book> book) {
        return book.flatMap(bookRepository::save);
    }
}
