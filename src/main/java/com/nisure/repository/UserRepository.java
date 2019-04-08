package com.nisure.repository;

import com.nisure.domain.User;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-03-26
 * Time: 16:13
 */
public interface UserRepository extends BaseRepository<User, Long> {

    public User findByName(String name);

    @Query("select user from User user where user.name = ?1 and user.password = ?2")
    public User checkUser(String name, String password);

    //属性方法 findBy + 属性
    public User findByNameAndPassword(String name, String password);

    @Query(value ="select c.* from user c "
            + "order by c.id desc limit ?1, ?2 ", nativeQuery = true)
    List<User> findAllList(Integer pageNumber, Integer pageSize);

    @Query(value ="select count(*) from user c "
            + "order by c.id desc ",nativeQuery = true)
    Integer countAllList();
}
