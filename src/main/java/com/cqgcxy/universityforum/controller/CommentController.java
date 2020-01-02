package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.resultmap.ViewComAndUser;
import com.cqgcxy.universityforum.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;



    @PostMapping("/getComment")
    Page<ViewComAndUser>findComment
            (
                    @RequestParam(value = "page",defaultValue = "0")Integer page,
                    @RequestParam(value = "size",defaultValue = "5")Integer size,
                    @RequestParam(value = "artId")Long artId
            )
    {
        System.out.println(artId);
        return commentService.findViewComAndUser(page,size,artId);

    }
}
