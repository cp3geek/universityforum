package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.repository.AdminRepository;
import com.cqgcxy.universityforum.service.AdminService;
import com.cqgcxy.universityforum.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
/*
* 管理员登陆接口*/
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping(value = "/loginbackstage")
    public boolean adminLogin(String username, String password){
        System.out.println(username+" "+password);
        return adminService.adminLogin(username,password);
    }
}
