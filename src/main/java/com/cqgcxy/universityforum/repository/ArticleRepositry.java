package com.cqgcxy.universityforum.repository;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.resultmap.ViewArtAndUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cqgcxy.universityforum.domain.User;

import javax.swing.text.View;
import java.util.List;

@Repository
public interface ArticleRepositry extends JpaRepository<Article,Long> {
    @Query("SELECT new com.cqgcxy.universityforum.resultmap.ViewArtAndUser(a, u) FROM Article a, User u WHERE a.artUserId = u.userId and a.artTypeId=:typeId")
    List<ViewArtAndUser>findAllByArtTypeId(Long typeId);

    @Query("SELECT new com.cqgcxy.universityforum.resultmap.ViewArtAndUser(a, u) FROM Article a, User u WHERE a.artUserId = u.userId ")
    Page<ViewArtAndUser>findViewArtAndUser(Pageable pageable);

    @Query("SELECT new com.cqgcxy.universityforum.resultmap.ViewArtAndUser(a, u) FROM Article a, User u WHERE a.artUserId = u.userId")
    Page<ViewArtAndUser>findViewArtAndUserMain(Pageable pageable);

    List<Article>findAllByArtUserId(Long userId);

}
