package br.com.uemersonpinheirojunior.todoapi.domain.services.impl;

import br.com.uemersonpinheirojunior.todoapi.application.payloads.request.UserRequest;
import br.com.uemersonpinheirojunior.todoapi.domain.entities.User;
import br.com.uemersonpinheirojunior.todoapi.domain.repositories.UserRepository;
import br.com.uemersonpinheirojunior.todoapi.domain.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserRequest userRequest) {
        return this.userRepository.save(new User(userRequest));
    }
}
