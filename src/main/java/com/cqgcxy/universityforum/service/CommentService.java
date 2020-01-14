package com.cqgcxy.universityforum.service;

import com.cqgcxy.universityforum.resultmap.ViewComAndUser;
import org.springframework.data.domain.Page;
import com.cqgcxy.universityforum.domain.Comment;



public interface CommentService {

    Page<ViewComAndUser>findViewComAndUser(Integer page,Integer size,Long artId);
    Comment insertComment(Comment comment);

}
