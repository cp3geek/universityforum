package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepositry extends JpaRepository<Article,Integer> {

}
