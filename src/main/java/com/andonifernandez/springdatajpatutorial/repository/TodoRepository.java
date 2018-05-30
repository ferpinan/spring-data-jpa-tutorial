package com.andonifernandez.springdatajpatutorial.repository;


import com.andonifernandez.springdatajpatutorial.model.Todo;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

interface TodoRepository extends Repository<Todo, Long> {
    void delete(Todo deleted);

    List<Todo> findAll();

    Optional<Todo> findOne(Long id);

    Todo save(Todo persisted);
}
