package be.bastinjul.testspringweb.controllers;

import be.bastinjul.testspringweb.entities.Book;
import be.bastinjul.testspringweb.repositories.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Book Controller")
@RequestMapping(path = "/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Operation
    @GetMapping("/{id}")
    @ResponseBody
    public Book bookById(@PathVariable("id") Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Operation
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Book postBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
