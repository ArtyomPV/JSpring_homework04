package ru.gb.JavaSpingHW06.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.JavaSpingHW06.model.MarkNote;

import java.util.Optional;

public interface MarkNoteRepository extends JpaRepository<MarkNote, Long> {

}
