package com.hexagonal.tareas.domain.ports.in;

import com.hexagonal.tareas.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo GetAdditionalTaskInfo(Long id);

}
