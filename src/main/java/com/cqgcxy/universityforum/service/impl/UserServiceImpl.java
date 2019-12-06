package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.UserRepository;
import com.cqgcxy.universityforum.service.UserService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;



    @Override
        public User userLogin(String email, String password) {
            User user= userRepository.findUserByUserEmailAndUserPassword(email,password);
            return user;
    }

    @Override
    @Transactional
    public User userRegister(User user) {
        return userRepository.save(user);
    }
}
