package com.nisure.service.impl;

import com.nisure.domain.Permission;
import com.nisure.domain.Role;
import com.nisure.domain.User;
import com.nisure.repository.RoleRepository;
import com.nisure.repository.UserRepository;
import com.nisure.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-03-26
 * Time: 16:17
 */
@Service
@Transactional
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User checkUser(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }
}
