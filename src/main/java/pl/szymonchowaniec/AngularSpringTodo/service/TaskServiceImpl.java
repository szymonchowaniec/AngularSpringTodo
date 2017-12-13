package pl.szymonchowaniec.AngularSpringTodo.service;

import org.springframework.stereotype.Service;
import pl.szymonchowaniec.AngularSpringTodo.domain.Task;
import pl.szymonchowaniec.AngularSpringTodo.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return null;
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
