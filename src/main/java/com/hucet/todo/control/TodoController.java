package com.hucet.todo.control;

import com.hucet.todo.domain.TodoEntity;
import com.hucet.todo.dto.TodoDto;
import com.hucet.todo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@Slf4j
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/create", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Long createTodo(@RequestBody TodoDto item) {
        return todoService.createTodo(item).getId();
    }

    @GetMapping(value = "/todos")
    ResponseEntity<List<TodoEntity>> allTodos() {
        return new ResponseEntity<List<TodoEntity>>(todoService.getAll(), HttpStatus.OK);
    }
}
