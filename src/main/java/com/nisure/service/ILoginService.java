package com.nisure.service;

import com.nisure.domain.Role;
import com.nisure.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-03-26
 * Time: 15:51
 */
public interface ILoginService{
 public User findByName(String name);
 public User checkUser(String name, String password);
 List<User> findAllList(Integer pageNumber, Integer pageSize);
 Integer countAllList();
}
