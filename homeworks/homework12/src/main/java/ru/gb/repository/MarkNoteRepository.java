package ru.gb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.model.MarkNote;

import java.util.Optional;

public interface MarkNoteRepository extends JpaRepository<MarkNote, Long> {

}
