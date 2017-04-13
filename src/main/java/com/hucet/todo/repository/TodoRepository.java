package com.hucet.todo.repository;

import com.hucet.todo.domain.TodoEntity;
import org.springframework.data.repository.Repository;

/**
 * Created by taesu on 2017-04-13.
 */
public interface TodoRepository extends Repository<TodoEntity, Long> {
    TodoEntity save(TodoEntity entity);
}
