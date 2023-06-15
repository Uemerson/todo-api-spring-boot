package br.com.uemersonpinheirojunior.todoapi.domain.services;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.TodoRequest;
import br.com.uemersonpinheirojunior.todoapi.domain.entities.Todo;

public interface TodoService {
    Todo create(TodoRequest todoRequest);
}
