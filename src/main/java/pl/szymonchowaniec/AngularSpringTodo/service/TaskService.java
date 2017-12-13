package pl.szymonchowaniec.AngularSpringTodo.service;

import pl.szymonchowaniec.AngularSpringTodo.domain.Task;

public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
