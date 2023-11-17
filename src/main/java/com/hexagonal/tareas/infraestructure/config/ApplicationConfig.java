package com.hexagonal.tareas.infraestructure.config;

import com.hexagonal.tareas.application.services.TaskService;
import com.hexagonal.tareas.application.usecases.*;
import com.hexagonal.tareas.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.tareas.domain.ports.out.ExternalServicePort;
import com.hexagonal.tareas.domain.ports.out.TaskRepositoryPort;
import com.hexagonal.tareas.infraestructure.adapters.ExternalServiceAdapter;
import com.hexagonal.tareas.infraestructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase){
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort),
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
