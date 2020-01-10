package com.elead.model.article.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wwy
 * @date 2020/1/6
 * 文章标签
 */
@Data
@ToString
@NoArgsConstructor
@TableName(value = "wb_tag")
public class Tag {
    @TableId
    private Long id;
    /**
     * 标签名
     */
    private String tagName;
}
