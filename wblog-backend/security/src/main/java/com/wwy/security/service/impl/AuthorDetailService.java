package com.wwy.security.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.elead.model.article.po.User;
import com.wwy.security.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author wwy
 * @date 2020/1/10
 */
public class AuthorDetailService implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User();
        user.setUsername(s);
        User user1 = userMapper.selectOne(new QueryWrapper<>(user));
        if(user1==null){
            return null;
        }
        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .withUsername(user1.getUsername())
                .password(user1.getPassword())
                .authorities("admin")
                .build();
        return userDetails;
    }
}
