package com.hucet.todo.repository;

import com.hucet.todo.domain.TodoEntity;
import org.springframework.data.repository.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by taesu on 2017-04-13.
 */
public interface TodoRepository extends Repository<TodoEntity, Long> {
    TodoEntity save(TodoEntity entity);

    List<TodoEntity> findAll();
}
