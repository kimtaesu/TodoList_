package com.hucet.todo.control;

import com.hucet.todo.dto.TodoDto;
import com.hucet.todo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/create", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Long createTodo(@RequestBody TodoDto item) {
        todoService.createTodo(item);
        return todoService.createTodo(item).getId();
    }
}
