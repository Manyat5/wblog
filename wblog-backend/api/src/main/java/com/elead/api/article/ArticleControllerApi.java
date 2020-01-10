package com.elead.api.article;

import com.elead.model.article.po.Article;
import com.elead.model.web.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @author wwy
 * @date 2020/1/6
 */
@Api(value = "文章管理接口",description = "文章crud")
public interface ArticleControllerApi {
    @ApiOperation("显示所有文章")
    BaseResponse showAll();

    @ApiOperation("显示特定用户的所有文章")
    BaseResponse ListByUid(Long uid);

    @ApiOperation("删除特定文章")
    BaseResponse remove(Long uid);

    @ApiOperation("编辑文章内容")
    BaseResponse edit(Article article);

    @ApiOperation("创建新文章")
    BaseResponse add(Article article);

}
