package com.michaelschoenbeck.task.repository;

import com.michaelschoenbeck.task.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {




}
