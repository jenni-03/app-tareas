package com.hexagonal.tareas.infraestructure.repositories;

import com.hexagonal.tareas.infraestructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {

}
