package com.cqgcxy.universityforum.service;

import com.cqgcxy.universityforum.domain.ArticleType;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArticleTypeService {
    List<ArticleType> getallArticleType();
    Page<ArticleType> findArticleNoCriteria(Integer page, Integer size);

}
