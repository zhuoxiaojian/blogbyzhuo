package com.nisure.repository;

import com.nisure.domain.User;
import org.springframework.data.jpa.repository.Query;

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
}
