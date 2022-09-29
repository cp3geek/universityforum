package com.cqgcxy.universityforum.controller;

import com.cqgcxy.universityforum.domain.Article;
import com.cqgcxy.universityforum.domain.User;
import com.cqgcxy.universityforum.repository.ArticleRepositry;
import com.cqgcxy.universityforum.resultmap.ViewArtAndUser;
import com.cqgcxy.universityforum.service.ArticleService;
import com.cqgcxy.universityforum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.Date;
import java.util.List;
/*
* 获取帖子
* 分页查询
* 根据类型查找帖子
* 获取新发布的帖子
* 发布帖子
* 通过用户id获取帖子
*
*
* */
@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;
    @Autowired
    ArticleRepositry articleRepositry;


    @PostMapping("/getallarticle")
    List<Article>getAllArticle(){
        return articleService.getAllArticle();
    }


//    @PostMapping("/pagearticle1")
//    public Page<Article>  findArticleNoQuery(
//            @RequestParam(value = "page",defaultValue = "0")Integer page,
//            @RequestParam(value = "size",defaultValue = "5")Integer size)
//    {
//        Page<Article> pages = articleService.findArticleNoCriteria(page, size);
//
////        pages.forEach(System.out::println);
////        System.out.println("总记录数"+pages.getTotalElements());
////        System.out.println("总页数"+pages.getTotalPages());
////        System.out.println("当前页面有多少条记录"+pages.getNumberOfElements());
////        System.out.println("当前页面的list的"+pages.getContent());
////        System.out.println("当前第几页"+pages.getNumber()+1);
//        return pages;
//    }


    @PostMapping("/getarticlebytypeid")
    List<ViewArtAndUser>getArticleByTypeId(Long typeId){
        System.out.println(typeId);
        return articleService.findAllByArtTypeId(typeId);
    }


    //这里改成分页查询，做无限滚动，提升用户体验
    @PostMapping("/pagearticle")
    Page<ViewArtAndUser>getArtAndUserInfo(
            @RequestParam(value = "page",defaultValue = "0")Integer page,
            @RequestParam(value = "size",defaultValue = "5")Integer size
    ){
        System.out.println(page);
        return articleService.findAllArtAndUser(page,size);
    }

    @GetMapping("/getpagearticle")
    Page<ViewArtAndUser>getArticleAndUser(
            @RequestParam(value = "page",defaultValue = "0")Integer page,
            @RequestParam(value = "size",defaultValue = "2")Integer size)
    {
        System.out.println(page);
        Page<ViewArtAndUser> pages;
        if (page!=0) {
             pages = articleService.findArtAndUser(page-1, size);
            System.out.println(page-1);
        }else{
             pages = articleService.findArtAndUser(page, size);
        }
        return pages;
    }

    @GetMapping("/getnew")
    Page<ViewArtAndUser>getnew(
            @RequestParam(value = "page",defaultValue = "0")Integer page,
            @RequestParam(value = "size",defaultValue = "20")Integer size)
    {
        Page<ViewArtAndUser> pages;
        pages = articleService.findnew(page,size);
        return pages;
    }


    @PostMapping("/newpost")
    int newPost(@RequestParam(value = "userId")Long userId,
                @RequestParam(value = "title")String title,
                @RequestParam(value = "text")String text,
                @RequestParam(value = "select")Long select)
    {

        Article article=new Article();
        article.setArtUserId(userId);
        article.setArtTitle(title);
        article.setArtContent(text);
        article.setArtTypeId(select);
        Date date=new Date();
        article.setArtCreTime(date);

        return articleService.Post(article)!=null?200:400;
    }


    @PostMapping("/findartbyuserid")
    List<Article>findArtByUserId(@RequestParam(value = "userId")Long userId){


        return articleRepositry.findAllByArtUserId(userId);

    }






}
