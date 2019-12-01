package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.UserRepository;
import com.cqgcxy.universityforum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public boolean userLogin(String email, String password) {
        User user= userRepository.findUserByUserEmailAndUserPassword(email,password);
        return user!=null;
    }
}
