package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/userlogin")
    public User userLogin(String email, String password){
        System.out.println(email+" "+password);
        return userService.userLogin(email,password);

    }


}
