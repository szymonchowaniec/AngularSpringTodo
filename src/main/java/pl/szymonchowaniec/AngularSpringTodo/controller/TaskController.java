package pl.szymonchowaniec.AngularSpringTodo.controller;

import org.springframework.web.bind.annotation.*;
import pl.szymonchowaniec.AngularSpringTodo.domain.Task;
import pl.szymonchowaniec.AngularSpringTodo.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list(){
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
