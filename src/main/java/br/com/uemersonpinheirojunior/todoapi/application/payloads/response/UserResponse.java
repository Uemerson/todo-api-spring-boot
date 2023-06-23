package br.com.uemersonpinheirojunior.todoapi.application.payloads.response;

import br.com.uemersonpinheirojunior.todoapi.domain.entities.User;

import java.time.LocalDateTime;

public class UserResponse {
    private final String name;
    private final String email;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public UserResponse(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.createdAt = user.getCreatedAt();
        this.updatedAt = user.getUpdatedAt();
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
