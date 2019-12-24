package com.cqgcxy.universityforum.service;

import com.cqgcxy.universityforum.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {

    User userLogin(String email,String password);
    User userRegister(User user);
    Page<User>findhotuser(Integer page,Integer size);


}
