package com.cqgcxy.universityforum.resultmap;

import com.cqgcxy.universityforum.domain.Comment;
import com.cqgcxy.universityforum.domain.User;

import java.io.Serializable;

public class ViewComAndUser implements Serializable {
    private User user;
    private Comment comment;


    public ViewComAndUser(){}

    @Override
    public String toString() {
        return "ViewComAndUser{" +
                "user=" + user +
                ", comment=" + comment +
                '}';
    }

    public ViewComAndUser(Comment comment) {
        User user=new User();
        this.comment = comment;
        this.user=user;
    }

    public ViewComAndUser(User user) {
        Comment comment=new Comment();
        this.user = user;
        this.comment=comment;
    }

    public ViewComAndUser(Comment comment,User user) {
        this.user = user;
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
