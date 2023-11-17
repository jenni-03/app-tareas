package com.hexagonal.tareas.application.services;

import com.hexagonal.tareas.domain.models.AdditionalTaskInfo;
import com.hexagonal.tareas.domain.models.Task;
import com.hexagonal.tareas.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class TaskService implements CreateTaskUseCase, UpdateTaskUseCase, RetrieveTaskUseCase, DeleteTaskUseCase, GetAdditionalTaskInfoUseCase {

    private final CreateTaskUseCase createTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    public TaskService(CreateTaskUseCase createTaskUseCase, UpdateTaskUseCase updateTaskUseCase, RetrieveTaskUseCase retrieveTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AdditionalTaskInfo GetAdditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.GetAdditionalTaskInfo(id);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task task) {
        return updateTaskUseCase.updateTask(id, task);
    }
}
