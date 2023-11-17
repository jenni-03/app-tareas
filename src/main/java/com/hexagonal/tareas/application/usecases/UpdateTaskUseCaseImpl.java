package com.hexagonal.tareas.application.usecases;

import com.hexagonal.tareas.domain.models.Task;
import com.hexagonal.tareas.domain.ports.in.UpdateTaskUseCase;
import com.hexagonal.tareas.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.updateTask(updateTask);
    }
}
