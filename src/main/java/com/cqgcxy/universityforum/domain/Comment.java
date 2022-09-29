package com.cqgcxy.universityforum.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Comment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ComId;

    private String comContent;//评论正文
    private Long comArtId;//文章id
    private Long comUserId;//评论用户得id
    @JsonFormat(timezone = "GMT+8",pattern = "YYYY-MM-dd HH:mm:ss")
    private Date comTime;//评论时间
}
