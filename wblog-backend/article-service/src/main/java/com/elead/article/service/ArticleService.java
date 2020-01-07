package com.elead.article.service;


import com.elead.model.vo.ArticleInfo;

import java.util.List;

/**
 * @author wwy
 * @date 2020/1/6
 */
public interface ArticleService {
    /**
     *返回所有与页面相关的信息
     * 只有超级管理员才可以操作
     */
    List<ArticleInfo> listAll();

    /**
     * 返回特定用户的所有文章
     */
    List<ArticleInfo> listByUid(Long uid);

    /**
     * 删除文章
     */
    Boolean delByAid(Long aid);
}
