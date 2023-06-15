package br.com.uemersonpinheirojunior.todoapi.domain.services.impl;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.TodoRequest;
import br.com.uemersonpinheirojunior.todoapi.domain.entities.Todo;
import br.com.uemersonpinheirojunior.todoapi.domain.repositories.TodoRepository;
import br.com.uemersonpinheirojunior.todoapi.domain.services.TodoService;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public Todo create(TodoRequest todoRequest) {
        return this.todoRepository.save(new Todo(todoRequest));
    }
}
