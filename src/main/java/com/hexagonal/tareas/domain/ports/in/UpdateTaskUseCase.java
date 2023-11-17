package com.hexagonal.tareas.domain.ports.in;

import com.hexagonal.tareas.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask(Long id, Task task);

}
