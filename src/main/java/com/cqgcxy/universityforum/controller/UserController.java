package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.service.UserService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/userlogin")
    public User userLogin(String email, String password){
        System.out.println(email+" "+password);
        return userService.userLogin(email,password);

    }

    @GetMapping("/hotuser")
    public Page<User> gethotuser(
            @RequestParam(value = "page",defaultValue = "0")Integer page,
            @RequestParam(value = "size",defaultValue = "3")Integer size                     ){

        Page<User> pages = userService.findhotuser(page,size);

        return pages;
    }

    @PostMapping("/register")
    public int signUp(String user){
        //bug
        //曲线救国，传变量

        System.out.println(user);
        Date date = new Date();//获得系统时间

//        User newUser=userService.userRegister(user);
//        if( newUser==null)return 404;
        return 200;
    }


}
