package com.nisure.repository;

import com.nisure.domain.Article;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-04-08
 * Time: 15:01
 */
public interface ArticleRepository extends BaseRepository<Article, Long> {
    @Query(value ="select c.* from article c "
            + "order by c.id desc limit ?1, ?2 ", nativeQuery = true)
    List<Article> findAllList(Integer pageNumber, Integer pageSize);

    @Query(value ="select count(*) from article c "
            + "order by c.id desc ",nativeQuery = true)
    Integer countAllList();
}
