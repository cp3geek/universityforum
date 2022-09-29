package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.repository.ArticleRepositry;
import com.cqgcxy.universityforum.resultmap.ViewArtAndUser;
import com.cqgcxy.universityforum.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//对帖子一系列操作服务层
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    ArticleRepositry articleRepositry;


    @Override
    public List<Article> getAllArticle() {
        return articleRepositry.findAll();
    }

    @Override
    public Page<Article> findArticleNoCriteria(Integer page, Integer size) {
        Pageable pageable=PageRequest.of(page,size,Sort.Direction.ASC,"artId");
        return articleRepositry.findAll(pageable);
    }

    @Override
    public List<ViewArtAndUser> findAllByArtTypeId(Long typeId) {
        return articleRepositry.findAllByArtTypeId(typeId);
    }

    @Override
    public Page<ViewArtAndUser> findArtAndUser(Integer page, Integer size) {
        Pageable pageable=PageRequest.of(page,size,Sort.Direction.DESC,"artLikeNum");
        return articleRepositry.findViewArtAndUserMain(pageable);
    }

    @Override
    public Page<ViewArtAndUser> findnew(Integer page, Integer size) {
        Pageable pageable=PageRequest.of(page,size, Sort.Direction.DESC,"artCreTime");
        return articleRepositry.findViewArtAndUserMain(pageable);
    }

    @Override
    public Page<ViewArtAndUser> findAllArtAndUser(Integer page, Integer size) {
        Pageable pageable=PageRequest.of(page,size, Sort.Direction.DESC,"artView");
        return articleRepositry.findViewArtAndUser(pageable);
    }

    @Override
    @Transactional
    public Article Post(Article article) {
        return articleRepositry.save(article);
    }


}
