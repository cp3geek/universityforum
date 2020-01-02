package com.cqgcxy.universityforum;



import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.ArticleRepositry;

import com.cqgcxy.universityforum.repository.CommentRepositry;
import com.cqgcxy.universityforum.repository.UserRepository;
import com.cqgcxy.universityforum.service.ArticleService;
import com.cqgcxy.universityforum.service.ArticleTypeService;
import com.cqgcxy.universityforum.service.UserService;
import com.cqgcxy.universityforum.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.data.domain.Sort.Direction.DESC;

@SpringBootTest
class UniversityforumApplicationTests {


    @Autowired
    CommentRepositry commentRepositry;



    @Autowired
    UserRepository userRepository;
    @Autowired
    ArticleRepositry articleRepositry;
    @Autowired
    UserService userService;

    @Autowired
    ArticleTypeService articleTypeService;


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
        userService.userRegister(new User());
    }
    @Test
    void TestArticleType(){
        articleTypeService.getallArticleType().forEach(System.out::println);
    }

    @Test
    void Testaa(){
//        articleRepositry.findViewArtAndUser().forEach(System.out::println);
    }
    @Test
    void Testpage(){


    }





}
