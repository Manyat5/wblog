package com.elead.article.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.elead.model.article.po.Tag;

import java.util.List;

/**
 * @author wwy
 * @date 2020/1/6
 */
public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 通过文章id查询到所有标签
     */
    List<Tag> selByAId(Long aid);
}
