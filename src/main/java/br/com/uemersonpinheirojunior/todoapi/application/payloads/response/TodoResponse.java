package br.com.uemersonpinheirojunior.todoapi.application.payloads.response;

import br.com.uemersonpinheirojunior.todoapi.domain.entities.Todo;

public class TodoResponse {
    private String text;

    public TodoResponse(Todo todo) {
        this.text = todo.getText();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
