package ru.gb.seminar05Example02.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.seminar05Example02.model.Book;
import ru.gb.seminar05Example02.repository.BookRepository;
import ru.gb.seminar05Example02.service.BookService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    @GetMapping()
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }
}
