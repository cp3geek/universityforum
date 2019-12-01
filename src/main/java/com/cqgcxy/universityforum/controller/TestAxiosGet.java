package com.cqgcxy.universityforum.controller;


import com.cqgcxy.universityforum.domain.Admin;
import com.cqgcxy.universityforum.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestAxiosGet {
    @Autowired
    AdminRepository adminRepository;

    @PostMapping(value = "/getadmin")
    List<Admin> getAdmin(String username,String password){
        System.out.println(username);
        adminRepository.findAll().forEach(System.out::println);
        return adminRepository.findAll();
    }
}
