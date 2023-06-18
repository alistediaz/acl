package com.acl.tareas.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acl.tareas.domain.Tarea;


public interface TareaRepository extends JpaRepository<Tarea, Integer> {}