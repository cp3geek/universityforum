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
/*实体类*/
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;

    private String typeName;//标签类型
    private Date typeCreateTime;//创建时间
    private String typeDesc;//描述
    private Integer articleNum;//帖子数量

}
