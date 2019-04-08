package com.nisure.service.impl;

import com.nisure.domain.Article;
import com.nisure.repository.ArticleRepository;
import com.nisure.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-04-08
 * Time: 15:06
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> findAllList(Integer pageNumber, Integer pageSize) {
        List<Article> articles = articleRepository.findAllList(pageNumber, pageSize);
        return articles;
    }

    @Override
    public Integer countAllList() {
        Integer count = articleRepository.countAllList();
        return count;
    }
}
