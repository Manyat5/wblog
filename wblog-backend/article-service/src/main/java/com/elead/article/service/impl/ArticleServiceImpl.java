package com.elead.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.elead.article.dao.ArticleMapper;
import com.elead.article.dao.TagMapper;
import com.elead.article.dao.UserMapper;
import com.elead.model.po.Article;
import com.elead.model.vo.ArticleInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.elead.article.service.ArticleService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wwy
 * @date 2020/1/6
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private TagMapper tagMapper;

    @Override
    public List<ArticleInfo> listAll() {
        List<Article> articles = articleMapper.selectList(null);
        return xfer(articles);
    }

    @Override
    public List<ArticleInfo> listByUid(Long uid) {
        Article article = new Article();
        article.setUid(uid);
        List<Article> articles = articleMapper.selectList(new QueryWrapper<>(article));
        return xfer(articles);
    }

    @Override
    @Transactional
    public Boolean delByAid(Long aid) {
        int result = articleMapper.deleteById(aid);
        return result==1;
    }

    /**
     * 将articles转化为articleInfo
     */
    private List<ArticleInfo> xfer(List<Article> articles){
        return articles.stream()
                //转为子类
                .map(article->{
                    ArticleInfo articleInfo = new ArticleInfo();
                    BeanUtils.copyProperties(article,articleInfo);
                    //设置作者
                    articleInfo.setUser(userMapper.selectById(articleInfo.getUid()));
                    //设置标签
                    articleInfo.setTags(tagMapper.selByAId(articleInfo.getId()));
                    return articleInfo;
                })
                .collect(Collectors.toList());
    }
}
