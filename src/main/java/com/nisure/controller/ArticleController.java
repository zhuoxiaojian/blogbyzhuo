package com.nisure.controller;

import com.nisure.domain.Article;
import com.nisure.service.ArticleService;
import com.nisure.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-04-08
 * Time: 15:09
 */
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping( value = "/getArticleList")
    public ResultData getArticleList(){
        List<Article> articles = articleService.findAllList(0, 10);
        Integer count = articleService.countAllList();
        return ResultData.ok().put("count", count).put("rows", articles);
    }
}
