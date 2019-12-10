package com.cqgcxy.universityforum.controller;


import com.cqgcxy.universityforum.domain.ArticleType;
import com.cqgcxy.universityforum.service.ArticleService;
import com.cqgcxy.universityforum.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleTypeController {
    @Autowired
    ArticleTypeService articleTypeService;

    @PostMapping("/getallarticletype")
    List<ArticleType> getAllArticleType(){
        return articleTypeService.getallArticleType();
    }

}
