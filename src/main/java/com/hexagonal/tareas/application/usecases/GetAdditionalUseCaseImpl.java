package com.hexagonal.tareas.application.usecases;

import com.hexagonal.tareas.domain.models.AdditionalTaskInfo;
import com.hexagonal.tareas.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.hexagonal.tareas.domain.ports.out.ExternalServicePort;
import com.hexagonal.tareas.domain.ports.out.TaskRepositoryPort;

public class GetAdditionalUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }


    @Override
    public AdditionalTaskInfo GetAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
