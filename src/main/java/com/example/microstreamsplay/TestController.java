package com.example.microstreamsplay;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class TestController {
    private final BooksRepository booksRepository;

    @GetMapping
    public List<Book> getBooks() {
        return booksRepository.getAll();
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        booksRepository.add(book);
    }
}
