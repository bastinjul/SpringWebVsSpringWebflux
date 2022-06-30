package be.bastinjul.testspringwebflux.controllers;

import be.bastinjul.entities.Book;
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

    @Operation
    @GetMapping("/{id}")
    @ResponseBody
    public Mono<Book> bookById(@PathVariable("id") Long id) {
        return Mono.empty();
    }

    @Operation
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> postBook(@RequestBody Mono<Book> book) {
        return Mono.empty();
    }
}
