package com.hexagonal.tareas.domain.ports.in;

import com.hexagonal.tareas.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
