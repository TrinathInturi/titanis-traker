package com.titanis.tracker.controller;

import com.titanis.tracker.model.Book;
import com.titanis.tracker.repository.BookRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "/books",tags = {"Books"})
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping()
    public List<Book> GetAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping()
    public Book NewBook(@RequestBody Book newBook) {
        return bookRepository.save(newBook);
    }
}
