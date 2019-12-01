package com.cqgcxy.universityforum;



import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UniversityforumApplicationTests {

    @Autowired
    UserRepository userRepository;


    @Test
    void contextLoads() {
        List<User> all = userRepository.findAll();
        all.forEach(System.out::println);




    }

}
