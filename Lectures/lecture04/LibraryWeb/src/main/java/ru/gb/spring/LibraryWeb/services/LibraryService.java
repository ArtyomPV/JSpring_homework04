package ru.gb.spring.LibraryWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.spring.LibraryWeb.domains.Book;
import ru.gb.spring.LibraryWeb.repositories.Library;

import java.util.List;

@Service
public class LibraryService {

    private final Library library;
    @Autowired
    public LibraryService(Library library) {
        this.library = library;
    }

    public List<Book> getAllBooks(){
        return library.getAllBooks();
    }

    public Book getBookById(Long id){
        return library.getBookById(id);
    }

    public Long addBook(Book book){
        library.addBook(book);
        return book.getId();
    }

    public void deleteBook(Long id){
        library.deleteBook(id);
    }
}

