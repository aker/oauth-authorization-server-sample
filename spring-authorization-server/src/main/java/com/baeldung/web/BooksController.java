package com.baeldung.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @GetMapping("/books")
    public String[] getArticles() {
        return new String[]{"Book 1", "Book 2", "Book 3"};
    }
}