package com.hexagonal.tareas.domain.ports.out;

import com.hexagonal.tareas.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {
    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
