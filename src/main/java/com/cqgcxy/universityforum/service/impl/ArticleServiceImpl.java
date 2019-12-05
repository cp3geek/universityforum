package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.repository.ArticleRepositry;
import com.cqgcxy.universityforum.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepositry articleRepositry;


    @Override
    public List<Article> getAllArticle() {
        return articleRepositry.findAll();
    }
}
