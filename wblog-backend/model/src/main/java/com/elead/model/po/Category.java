package com.elead.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wwy
 * @date 2020/1/6
 * 分类目录
 */
@Data
@NoArgsConstructor
@ToString
@TableName("wb_category")
public class Category {
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 分类名
     */
    private String cateName;
}
