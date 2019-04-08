package com.nisure.service;

import com.nisure.domain.Article;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-04-08
 * Time: 15:06
 */
public interface ArticleService {
    List<Article> findAllList(Integer pageNumber, Integer pageSize);
    Integer countAllList();
}
