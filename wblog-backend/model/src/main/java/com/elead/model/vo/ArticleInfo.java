package com.elead.model.vo;

import com.elead.model.po.Article;
import com.elead.model.po.Tag;
import com.elead.model.po.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author wwy
 * @date 2020/1/6
 * 展示在页面的博客信息
 */
@Data
@NoArgsConstructor
@ToString
public class ArticleInfo extends Article {
    /**
     * 所有标签
     */
    private List<Tag> tags;
    /**
     * 作者信息
     */
    private User user;
    /**
     * 评论
     */
}
