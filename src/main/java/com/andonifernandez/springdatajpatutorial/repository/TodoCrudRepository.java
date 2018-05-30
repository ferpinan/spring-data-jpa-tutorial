package com.andonifernandez.springdatajpatutorial.repository;


import com.andonifernandez.springdatajpatutorial.model.Todo;
import org.springframework.data.repository.CrudRepository;

interface TodoCrudRepository extends CrudRepository<Todo, Long> {

}
