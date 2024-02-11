package ru.gb.spring.LibraryWeb.repositories;

import org.springframework.stereotype.Repository;
import ru.gb.spring.LibraryWeb.domains.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@Repository
public class Library {
    private List<Book> books = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public List<Book> getAllBooks(){
        return books;
    }

    public Book getBookById(Long id){
        return books.stream()
                .filter(book->book.getId().equals(id))
                .findFirst().
                orElse(null);
    }

    public void addBook(Book book){
        if(book.getId() == null){
            book.setId(counter.incrementAndGet());
        }
        books.add(book);
    }

    public void deleteBook(Long id){
        books.removeIf(book -> book.getId().equals(id));
    }

}
