package com.hucet.todo.service;

import com.hucet.todo.domain.TodoEntity;
import com.hucet.todo.dto.TodoDto;
import com.hucet.todo.repository.TodoRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

@Service
@Slf4j
@Transactional
public class TodoService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    TodoRepository repository;

    public TodoEntity createTodo(TodoDto item) {
        TodoEntity todoEntity = modelMapper.map(item, TodoEntity.class);
        return repository.save(todoEntity);
    }

    public List<TodoEntity> getAll() {
        return repository.findAll();
    }
}
