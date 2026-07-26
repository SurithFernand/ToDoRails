package com.todo.TodoRails.repository;

import com.todo.TodoRails.model.Task;
import com.todo.TodoRails.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Find task related to a user and a date
    List<Task> findByUserAndDueDate(User user, LocalDate dueDate);

    // Find tasks by user, due date, and completion status
    List<Task> findByUserAndDueDateAndCompleted(User user, LocalDate dueDate, boolean completed);

    // Find a task by user and taskId
    Task findByUserAndId(User user, Long id);

    // Find a task by user
    List<Task> findByUser(User user);

    // Find task by taskId
    Task getById(Long id);

    // Count tasks by completion status
    int countByCompleted(boolean completed);

}
