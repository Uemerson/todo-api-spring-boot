package br.com.uemersonpinheirojunior.todoapi.application.web.controllers;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.UserRequest;
import br.com.uemersonpinheirojunior.todoapi.application.payloads.response.UserResponse;
import br.com.uemersonpinheirojunior.todoapi.domain.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    private ResponseEntity<UserResponse> create(@RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(new UserResponse(
                this.userService.create(userRequest)), HttpStatus.CREATED);
    }
}
