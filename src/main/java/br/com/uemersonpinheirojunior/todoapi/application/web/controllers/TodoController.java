package br.com.uemersonpinheirojunior.todoapi.application.web.controllers;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.TodoRequest;
import br.com.uemersonpinheirojunior.todoapi.application.payloads.response.TodoResponse;
import br.com.uemersonpinheirojunior.todoapi.domain.services.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    private ResponseEntity<TodoResponse> create(@RequestBody TodoRequest todoRequest) {
        return new ResponseEntity<>(new TodoResponse(
                this.todoService.create(todoRequest)), HttpStatus.CREATED);
    }
}
