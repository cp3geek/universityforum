package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @PostMapping("/pagearticle")
    public Page<Article>  findArticleNoQuery(
            @RequestParam(value = "page",defaultValue = "0")Integer page,
            @RequestParam(value = "size",defaultValue = "5")Integer size)
    {
        Page<Article> pages = articleService.findArticleNoCriteria(page, size);
        pages.forEach(System.out::println);
        return pages;
    }


}
