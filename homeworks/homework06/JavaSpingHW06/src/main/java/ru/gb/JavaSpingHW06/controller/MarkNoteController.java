package ru.gb.JavaSpingHW06.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.JavaSpingHW06.model.MarkNote;
import ru.gb.JavaSpingHW06.repository.MarkNoteRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 *
 */
@RestController
@RequestMapping("/marks")
@RequiredArgsConstructor
public class MarkNoteController {
    private final MarkNoteRepository repository;

    /**
     * Просмотр всех заметок.
     *
     * @return http ответ со статусом OK
     */
    @GetMapping
    public ResponseEntity<List<MarkNote>> getAllMarks() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    /**
     * Добавление заметки.
     *
     * @param markNote заметка включает заглавие и описание
     * @return http ответ со статусом CREATED
     */
    @PostMapping
    public ResponseEntity<MarkNote> createMark(@RequestBody MarkNote markNote) {
        return new ResponseEntity<>(repository.save(markNote), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarkNote> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(repository.findById(id).orElseThrow(null), HttpStatus.FOUND);
    }

    /**
     * Редактирование заметки.
     *
     * @param id       уникальный идентификатор
     * @param markNote заметка
     * @return http ответ со статусом OK если объект существует и
     * NOT_FOUND если объект по id не существует
     */
    @PutMapping("/{id}")
    public ResponseEntity<MarkNote> updateMArkNote(@PathVariable("id") Long id, @RequestBody MarkNote markNote) {
        Optional markNoteOptional = repository.findById(id);
        if (markNoteOptional.isPresent()) {
            MarkNote updatedMarkNote = (MarkNote) markNoteOptional.get();
            updatedMarkNote.setTitle(markNote.getTitle());
            updatedMarkNote.setContent(markNote.getContent());
            updatedMarkNote.setTimeCreation(LocalDateTime.now());

            return new ResponseEntity<>(repository.save(updatedMarkNote), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * Удаление заметки.
     * @param id уникальный идентификатор
     * @return http ответ со статусом OK
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
