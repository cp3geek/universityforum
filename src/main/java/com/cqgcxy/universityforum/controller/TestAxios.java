package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestAxios {
    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/getuser")
    public List<User> getUser(String username,Integer password){
        System.out.println(username+" "+password);
        userRepository.findAll().forEach(System.out::println);
        return userRepository.findAll();
    }
}
