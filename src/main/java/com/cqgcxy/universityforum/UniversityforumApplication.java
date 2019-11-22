package com.cqgcxy.universityforum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
public class UniversityforumApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityforumApplication.class, args);
    }

}
