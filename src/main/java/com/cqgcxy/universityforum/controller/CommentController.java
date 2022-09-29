package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.domain.Comment;
import com.cqgcxy.universityforum.resultmap.ViewComAndUser;
import com.cqgcxy.universityforum.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Date;
/*
* 评论
* */
@RestController
public class CommentController {

    @Autowired
    CommentService commentService;



    @PostMapping("/getComment")
    Page<ViewComAndUser>findComment(
                    @RequestParam(value = "page",defaultValue = "0")Integer page,
                    @RequestParam(value = "size",defaultValue = "30")Integer size,
                    @RequestParam(value = "artId")Long artId)
    {
        Page<ViewComAndUser>ss=commentService.findViewComAndUser(page,size,artId);
        System.out.println(ss.getContent());
        return commentService.findViewComAndUser(page,size,artId);
    }


    @PostMapping("/postcomment")
    int postComment(@RequestParam(value = "comArtId")Long comArtId,
                    @RequestParam(value = "text")String text,
                    @RequestParam(value = "comUserId")Long comUserId)
    {
        Comment comment=new Comment();

        Date date=new Date();
        comment.setComArtId(comArtId);
        comment.setComContent(text);
        comment.setComUserId(comUserId);
        comment.setComTime(date);


        //添加评论，写dao层增加方法，明日更新

        return commentService.insertComment(comment)!=null?200:404;
    }



}
