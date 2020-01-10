package com.elead.api.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wwy
 * @date 2020/1/6
 */
@EnableSwagger2
@Configuration
public class Swagger2 {
    /**
     * 通过 createRestApi函数来构建一个DocketBean
     * 函数名,可以随意命名,喜欢什么命名就什么命名
     */
    @Bean
    public Docket createRestApi(){
        //控制暴露出去的路径下的实例
        //如果某个接口不想暴露,可以使用以下注解
        //@ApiIgnore 这样,该接口就不会暴露在 swagger2 的页面下
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                //调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                .apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("博客接口文档")
                //创建人
                .contact("wwy")
                //版本号
                .version("1.0")
                //描述
                .description("博客后台接口文档")
                .build();
    }
}

