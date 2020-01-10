package com.elead.model.article.po;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * 用户信息
 */
@Data
@NoArgsConstructor
@ToString
@TableName("wb_user")
public class User {
    @TableId(type=IdType.UUID)
    private Long id;
    /**
     * 登录用户名
     */
    private String username;
    /**
     * 显示的用户名
     */
    private String nickname;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}
