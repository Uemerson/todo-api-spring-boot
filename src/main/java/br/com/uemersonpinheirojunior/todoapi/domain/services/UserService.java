package br.com.uemersonpinheirojunior.todoapi.domain.services;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.UserRequest;
import br.com.uemersonpinheirojunior.todoapi.domain.entities.User;

public interface UserService {
    User create(UserRequest userRequest);
}