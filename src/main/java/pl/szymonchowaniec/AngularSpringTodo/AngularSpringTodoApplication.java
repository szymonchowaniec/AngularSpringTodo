package pl.szymonchowaniec.AngularSpringTodo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.szymonchowaniec.AngularSpringTodo.domain.Task;
import pl.szymonchowaniec.AngularSpringTodo.service.TaskService;

import java.time.LocalDate;

@SpringBootApplication
public class AngularSpringTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringTodoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args -> {
			taskService.save(new Task(1L,"do sth", LocalDate.now(),true));
		};
	}
}
