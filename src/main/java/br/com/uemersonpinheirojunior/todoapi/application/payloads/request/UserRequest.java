package br.com.uemersonpinheirojunior.todoapi.application.payloads.request;

public class UserRequest {
    private final String name;
    private final String email;

    public UserRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
