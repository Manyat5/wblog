package com.elead.article.controller;

import com.elead.api.article.ArticleControllerApi;
import com.elead.article.service.ArticleService;
import com.elead.common.exception.BaseException;
import com.elead.common.utils.CommonUtils;
import com.elead.model.article.po.Article;
import com.elead.model.article.vo.ArticleInfo;
import com.elead.model.web.BaseResponse;
import com.elead.model.web.CommonCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wwy
 * @date 2020/1/6
 */
@RestController
@RequestMapping("/article")
public class ArticleController implements ArticleControllerApi {
    @Autowired
    private ArticleService articleService;

    @Override
    @GetMapping("/showAll")
    public BaseResponse<List<ArticleInfo>> showAll() {
        return CommonUtils.successResponse(articleService.listAll());
    }

    @Override
    @GetMapping("/list/{uid}")
    public BaseResponse<List<Article>> ListByUid(@PathVariable("uid") Long uid) {
        CommonUtils.nullInceptor(uid);
        return CommonUtils.successResponse(articleService.listByUid(uid));
    }

    @Override
    @DeleteMapping("/delete/{uid}")
    public BaseResponse remove(@PathVariable("aid") Long aid) {
        return CommonUtils.successResponse(articleService.delByAid(aid));
    }

    @PutMapping("/edit")
    @Override
    public BaseResponse edit(@RequestBody Article article){
        CommonUtils.nullInceptor(article);
        return CommonUtils.successResponse(articleService.edit(article));
    }

    @Override
    @PostMapping("/add")
    public BaseResponse add(Article article) {
        CommonUtils.nullInceptor(article);
        return CommonUtils.successResponse(articleService.listAll());
    }
}
