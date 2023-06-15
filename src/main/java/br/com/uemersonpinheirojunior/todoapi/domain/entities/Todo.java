package br.com.uemersonpinheirojunior.todoapi.domain.entities;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.TodoRequest;
import org.bson.types.ObjectId;

public class Todo {
    private ObjectId _id;
    private String text;

    public Todo(TodoRequest todoRequest) {
        this.text = todoRequest.getText();
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
