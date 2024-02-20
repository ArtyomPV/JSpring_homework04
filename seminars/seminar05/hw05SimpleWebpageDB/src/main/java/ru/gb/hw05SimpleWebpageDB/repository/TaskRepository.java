package ru.gb.hw05SimpleWebpageDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.hw05SimpleWebpageDB.models.Status;
import ru.gb.hw05SimpleWebpageDB.models.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByStatus(Status status);
}
