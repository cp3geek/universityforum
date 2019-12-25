package com.cqgcxy.universityforum.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userPassword;
    private String userName;
    private String userEmail;
    private String userSex;
    private String userPhone;
    private Byte userStatus;//用户状态1：激活 0：未激活


    private Date userTime;//注册时间
    private String userShow;//用户个性签名
    private String userBlog;//用户主页
    private String userImg;//用户头像
    private Integer userFans;//用户粉丝数
    private Integer userConcern;//用户关注数



}
