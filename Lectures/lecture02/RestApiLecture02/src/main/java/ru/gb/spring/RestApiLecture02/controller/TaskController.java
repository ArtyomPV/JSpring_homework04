package ru.gb.spring.RestApiLecture02.controller;

import org.springframework.web.bind.annotation.*;
import ru.gb.spring.RestApiLecture02.Task;
import ru.gb.spring.RestApiLecture02.service.TaskService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAll();
    }
    @GetMapping("/{id}")
    public Task getById(@PathVariable UUID id){
        return taskService.getTask(id);
    }
    @PostMapping
    public Task addById(@RequestBody Task task){
        return taskService.addTask(task);
    }
    @PutMapping("/{id}")
    public Task getById(@PathVariable UUID uuid, @RequestBody Task task){
        return taskService.updateTask(uuid, task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID uuid){
         taskService.deleteTask(uuid);
    }

}
