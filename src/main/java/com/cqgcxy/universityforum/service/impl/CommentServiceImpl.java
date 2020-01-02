package com.cqgcxy.universityforum.service.impl;

import com.cqgcxy.universityforum.repository.CommentRepositry;
import com.cqgcxy.universityforum.resultmap.ViewComAndUser;
import com.cqgcxy.universityforum.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepositry commentRepositry;



    @Override
    public Page<ViewComAndUser> findViewComAndUser(Integer page, Integer size,Long artId) {
        Pageable pageable = PageRequest.of(page,size,Sort.Direction.DESC,"comTime");
        return commentRepositry.findViewComAndUser(pageable,artId);
    }
}
