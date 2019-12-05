package com.cqgcxy.universityforum;



import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.ArticleRepositry;
import com.cqgcxy.universityforum.repository.UserRepository;
import com.cqgcxy.universityforum.service.UserService;
import com.cqgcxy.universityforum.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class UniversityforumApplicationTests {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ArticleRepositry articleRepositry;


    @Test
    void contextLoads() {
        List<User> all = userRepository.findAll();
        all.forEach(System.out::println);
    }
    @Test
    void TestArticle(){
        List<Article>all=articleRepositry.findAll();
        all.forEach(System.out::println);
    }
    @Test
    void TestAddUser(){

    }

}
