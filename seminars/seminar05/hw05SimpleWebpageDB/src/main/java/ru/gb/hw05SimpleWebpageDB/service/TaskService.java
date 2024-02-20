package ru.gb.hw05SimpleWebpageDB.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.hw05SimpleWebpageDB.models.Status;
import ru.gb.hw05SimpleWebpageDB.models.Task;
import ru.gb.hw05SimpleWebpageDB.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    public List<Task> getAllTasks(){
        return repository.findAll();
    }

    public List<Task> getAllByStatus(Status status){
        return repository.findAllByStatus(status);
    }

    public Task createTask(Task task){
        return repository.save(task);
    }

    public Optional<Task> getTaskById(Long id){
        return repository.findById(id);
    }
    public Task updateStatus(Long id, Task task){
        Optional<Task> optionalTask = getTaskById(id);
        if(optionalTask.isPresent()){
            Task newTask = optionalTask.get();
            newTask.setTitle(task.getTitle());
            newTask.setStatus(task.getStatus());
            return repository.save(newTask);
        } else {
            throw new IllegalArgumentException("Task not found by id: " + id);
        }
    }
     public void deleteTask(Long id){
        repository.deleteById(id);
     }
}
