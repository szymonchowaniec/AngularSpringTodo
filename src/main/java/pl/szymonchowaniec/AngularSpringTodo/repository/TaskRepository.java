package pl.szymonchowaniec.AngularSpringTodo.repository;

import org.springframework.data.repository.CrudRepository;
import pl.szymonchowaniec.AngularSpringTodo.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
