package com.cqgcxy.universityforum.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.UserRepository;
import com.cqgcxy.universityforum.service.UserService;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/*
* 用户注册登录
* */
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/userlogin")
    public User userLogin(String email, String password){
        System.out.println(email+" "+password);
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
//        encoder.matches()
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
    public int signUp(String userName,String userPassword,
                      String userShow,String userEmail,
                      String userPhone,String userSex)
    {

        User user=new User();
        user.setUserImg("default.jpg");
        user.setUserEmail(userEmail);
        user.setUserName(userName);

        user.setUserPhone(userPhone);
        user.setUserSex(userSex);
        user.setUserShow(userShow);
        user.setUserBlog("myself");
        Date date = new Date();//获得系统时间
        user.setUserTime(date);
        BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
        user.setUserPassword(bCryptPasswordEncoder.encode(userPassword));



        User newUser=userService.userRegister(user);
        if( newUser==null)return 404;
        return 200;
    }


    @PostMapping("/getuserlist")
    List<User>getUserList(){
        return userRepository.findAll();
    }


}
