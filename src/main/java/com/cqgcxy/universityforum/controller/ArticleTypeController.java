package com.cqgcxy.universityforum.controller;


import com.cqgcxy.universityforum.domain.ArticleType;
import com.cqgcxy.universityforum.service.ArticleService;
import com.cqgcxy.universityforum.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/*获取板块*/
@RestController
public class ArticleTypeController {
    @Autowired
    ArticleTypeService articleTypeService;

    @PostMapping("/getallarticletype")
    List<ArticleType> getAllArticleType(){
        return articleTypeService.getallArticleType();
    }

    @PostMapping("/gethotarticletype")
    public Page<ArticleType> findArticleNoQuery(
            @RequestParam(value = "page",defaultValue = "0")Integer page,
            @RequestParam(value = "size",defaultValue = "5")Integer size)
    {
        Page<ArticleType> pages = articleTypeService.findArticleNoCriteria(page, size);

//        pages.forEach(System.out::println);
//        System.out.println("总记录数"+pages.getTotalElements());
//        System.out.println("总页数"+pages.getTotalPages());
//        System.out.println("当前页面有多少条记录"+pages.getNumberOfElements());
//        System.out.println("当前页面的list的"+pages.getContent());
//        System.out.println("当前第几页"+pages.getNumber()+1);
        return pages;
    }

}
