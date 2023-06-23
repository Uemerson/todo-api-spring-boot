package br.com.uemersonpinheirojunior.todoapi.domain.entities;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.UserRequest;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

public class User {
    private final String name;
    private final String email;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
    private ObjectId _id;

    public User(UserRequest userRequest) {
        this.name = userRequest.getName();
        this.email = userRequest.getEmail();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
