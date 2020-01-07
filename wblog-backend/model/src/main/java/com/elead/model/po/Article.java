package com.elead.model.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author wwy
 * @date 2020/1/6
 * 文章
 */
@Data
@NoArgsConstructor
@ToString
@TableName("wb_article")

public class Article {
    @TableId
    private Long id;
    /**
     * 题目
     */
    private String title;
    /**
     * 摘要
     */
    private String summary;
    /**
     * 编辑时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date editTime;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 作者id
     */
    private Long uid;
    /**
     * markdown内容
     */
    private String mdContent;
    /**
     * html内容
     */
    private String htmlContent;
}
