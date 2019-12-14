package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.domain.ArticleType;
import com.cqgcxy.universityforum.repository.ArticleTypeRepositry;
import com.cqgcxy.universityforum.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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


    @Override
    public Page<ArticleType> findArticleNoCriteria(Integer page, Integer size) {
        Pageable pageable= PageRequest.of(page,size, Sort.Direction.DESC,"articleNum");
        return articleTypeRepositry.findAll(pageable);
    }
}
