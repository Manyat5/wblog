package com.elead.article;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wwy
 * @date 2020/1/6
 */
@SpringBootApplication
@MapperScan("com.elead.article.dao")
@EntityScan("com.elead.model")
@ComponentScan({"com.elead.api","com.elead.common"})
@ComponentScan("com.elead.article")
public class ArticleApp {
    public static void main(String[] args) {
        SpringApplication.run(ArticleApp.class,args);
    }
}
