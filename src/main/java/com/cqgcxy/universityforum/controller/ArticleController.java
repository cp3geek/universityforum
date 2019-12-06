package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/getallarticle")
    List<Article>getAllArticle(){
        return articleService.getAllArticle();
    }

}
