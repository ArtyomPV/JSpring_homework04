package ru.gb.seminar05Example02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.seminar05Example02.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
