package com.nisure.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-03-26
 * Time: 16:13
 */
@NoRepositoryBean
public interface BaseRepository<T, I extends Serializable> extends PagingAndSortingRepository<T, I>, JpaSpecificationExecutor<T> {
}
