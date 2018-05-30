package com.andonifernandez.springdatajpatutorial.repository;

import com.andonifernandez.springdatajpatutorial.model.Todo;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.Date;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {PersistenceContext.class})
@ContextConfiguration({"classpath:applicationContext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
public class TodoCrudRepositoryTest {

    @Autowired
    private TodoRepository repository;

    @Test
    public void prueba(){
        System.out.println("Andoni");
        repository.findAll();

        Todo todo = new Todo();
        todo.setCreationTime(new Date());
        todo.setTitle("TODO2");
        repository.save(todo);

        repository.findAll();


        assertTrue(true);
    }
}
