package com.bayu.employee.service.impl;

import com.bayu.employee.repository.UserRepository;
import com.bayu.employee.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
