package com.michaelschoenbeck.task.service;

import com.michaelschoenbeck.task.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);





}
