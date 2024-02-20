package ru.gb.hw05SimpleWebpageDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.hw05SimpleWebpageDB.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByTaskStatus(Task.TaskStatus status);
}
