package com.hexagonal.tareas.domain.ports.out;

import com.hexagonal.tareas.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {

    Task save(Task task);

    Optional<Task> findById(Long id);

    List<Task> findAll();

    Optional<Task> updateTask(Task task);//Long id

    boolean deleteById(Long id);

}
