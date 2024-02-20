package ru.gb.hw05SimpleWebpageDB.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.hw05SimpleWebpageDB.model.Task;
import ru.gb.hw05SimpleWebpageDB.service.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;
    @GetMapping()
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping()
    public Task addTask(@RequestBody Task task){
        return taskService.addTask(task);
    }

    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable Task.TaskStatus status){
        return taskService.findAllByTaskStatus(status);
    }

    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task){
        return  taskService.updateTask(id, task);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
