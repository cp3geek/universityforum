package com.cqgcxy.universityforum.resultmap;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.domain.User;

import java.io.Serializable;
/*结果集*/
public class ViewArtAndUser implements Serializable {
    @Override
    public String toString() {
        return "ViewArtAndUser{" +
                "article=" + article +
                ", user=" + user +
                '}';
    }

    private Article article;
    private User user;

    public ViewArtAndUser() {
    }

    public ViewArtAndUser(Article article, User user) {
        this.article = article;
        this.user = user;
    }
    public ViewArtAndUser(Article article) {
        User user=new User();
        this.article = article;
        this.user = user;
    }
    public ViewArtAndUser(User user) {
        Article article=new Article();
        this.article = article;
        this.user = user;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
