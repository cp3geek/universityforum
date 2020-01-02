package com.cqgcxy.universityforum.service;

import com.cqgcxy.universityforum.resultmap.ViewComAndUser;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


public interface CommentService {

    Page<ViewComAndUser>findViewComAndUser(Integer page,Integer size,Long artId);
}
