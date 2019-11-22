package com.cqgcxy.universityforum.domain;


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
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class commentMulti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comMultiId;

    private Long comId;//一级评论id
    private String comMultiContent;
    private Long comMultiUserId;//多级评论用户id
    private Date comMultiTime;
}
