package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.resultmap.ViewArtAndUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cqgcxy.universityforum.domain.User;

import java.util.List;

@Repository
public interface ArticleRepositry extends JpaRepository<Article,Long> {
    @Query("SELECT new com.cqgcxy.universityforum.resultmap.ViewArtAndUser(a, u) FROM Article a, User u WHERE a.artUserId = u.userId and a.artTypeId=:typeId")
    List<ViewArtAndUser>findAllByArtTypeId(Long typeId);

    @Query("SELECT new com.cqgcxy.universityforum.resultmap.ViewArtAndUser(a, u) FROM Article a, User u WHERE a.artUserId = u.userId")
    List<ViewArtAndUser>findViewArtAndUser();



}
