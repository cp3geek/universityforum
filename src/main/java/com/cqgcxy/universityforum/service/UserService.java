package com.cqgcxy.universityforum.service;

import com.cqgcxy.universityforum.domain.User;

public interface UserService {

    User userLogin(String email,String password);
    User userRegister(User user);

}
