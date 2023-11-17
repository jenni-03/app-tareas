package com.hexagonal.tareas.application.usecases;

import com.hexagonal.tareas.domain.models.Task;
import com.hexagonal.tareas.domain.ports.in.CreateTaskUseCase;
import com.hexagonal.tareas.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }


}
