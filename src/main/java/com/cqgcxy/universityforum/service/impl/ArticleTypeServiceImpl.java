package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.ArticleType;
import com.cqgcxy.universityforum.repository.ArticleTypeRepositry;
import com.cqgcxy.universityforum.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleTypeServiceImpl implements ArticleTypeService {

    @Autowired
    ArticleTypeRepositry articleTypeRepositry;

    @Override
    public List<ArticleType> getallArticleType() {
        return articleTypeRepositry.findAll();
    }
}
