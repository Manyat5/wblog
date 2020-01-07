package com.elead.article.controller;

import com.elead.api.article.ArticleControllerApi;
import com.elead.article.service.ArticleService;
import com.elead.model.vo.ArticleInfo;
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
        return new BaseResponse<>(CommonCode.SUCCESS,articleService.listAll());
    }

    @Override
    @GetMapping("/list/{uid}")
    public BaseResponse<List<ArticleInfo>> ListByUid(@RequestParam("uid") Long uid) {
        return new BaseResponse(CommonCode.SUCCESS,articleService.listByUid(uid));
    }

    @Override
    @DeleteMapping("/delete/{uid}")
    public BaseResponse remove(@RequestParam("aid") Long aid) {
        return new BaseResponse(CommonCode.SUCCESS,articleService.delByAid(aid));
    }


}
