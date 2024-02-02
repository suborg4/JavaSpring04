package ru.suborg.todolist.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * конфигурационный класс SQL-запросов
 * вынесение SQL-запросов в настройки.
 */

@Data
@ConfigurationProperties("database")
public class DatabaseConfig {
    private String queryFindAllTasks; // SQL-запрос для поиска всех задач
    private String findTaskByIdSql;  // SQL-запрос для поиска задачи подентификатору
    private String saveTaskSql;  // SQL-запрос для сохранения задачи
    private String updateTaskSql; // SQL-запрос для обновления задачи
    private String deleteTaskSql; // SQL-запрос для удаления задачи
}
