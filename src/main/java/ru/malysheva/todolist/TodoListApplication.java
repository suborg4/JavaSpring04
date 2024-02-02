package ru.suborg.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.suborg.todolist.config.DatabaseConfig;

@SpringBootApplication
@EnableConfigurationProperties(DatabaseConfig.class)
public class TodoListApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoListApplication.class, args);
    }

}
