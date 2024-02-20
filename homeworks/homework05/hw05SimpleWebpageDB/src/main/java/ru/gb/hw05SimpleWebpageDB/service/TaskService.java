package ru.gb.hw05SimpleWebpageDB.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.hw05SimpleWebpageDB.exceptions.TaskNotFoundException;
import ru.gb.hw05SimpleWebpageDB.model.Task;
import ru.gb.hw05SimpleWebpageDB.repository.TaskRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    public Optional<Task> findById(Long id){
        return repository.findById(id);
    }

    public List<Task> findAllByTaskStatus(Task.TaskStatus status){
        return repository.findAllByTaskStatus(status);
    }

    public Task addTask(Task task){
        return repository.save(task);
    }

    public void deleteTask(Long id){
        repository.deleteById(id);
    }

    public Task updateTask(Long id, Task newTask){
        Optional<Task> optionalTask = findById(id);
        if(optionalTask.isPresent()){
            Task task = optionalTask.get();
            task.setId(newTask.getId());
            task.setTitle(newTask.getTitle());
            task.setText(newTask.getText());
            task.setTaskStatus(newTask.getTaskStatus());
            task.setTimeCreation(LocalDateTime.now());
            return repository.save(task);
        } else {
            throw new IllegalArgumentException("book not found with id: " + id);
//            throw new TaskNotFoundException("Task not found by id - " + id);
        }
    }

    public Task updateStatus(Long id, Task.TaskStatus status){
        Optional<Task> optionalTask = findById(id);
        if(optionalTask.isPresent()){
            Task task = optionalTask.get();
            task.setTaskStatus(status);
            return repository.save(task);
        } else {
            throw new TaskNotFoundException("Task not found by id - " + id);
        }
    }

}
