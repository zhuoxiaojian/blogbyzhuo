package com.nisure.service.impl;

import com.nisure.domain.Permission;
import com.nisure.domain.Role;
import com.nisure.domain.User;
import com.nisure.repository.RoleRepository;
import com.nisure.repository.UserRepository;
import com.nisure.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User addUser(Map<String, Object> map) {
        User user = new User();
        user.setName(map.get("username").toString());
        user.setPassword(map.get("password").toString());
        userRepository.save(user);
        return user;
    }

    @Override
    public Role addRole(Map<String, Object> map) {
        Long userId = Long.valueOf(map.get("userId").toString());
        Optional optional = userRepository.findById(userId);
        if(optional.isPresent()){
            User user = (User)optional.get();
            Role role = new Role();
            role.setRoleName(map.get("roleName").toString());
            role.setUser(user);
            Permission permission = new Permission();
            permission.setPermission("create");
            permission.setRole(role);
            Permission permission1 = new Permission();
            permission1.setPermission("update");
            permission1.setRole(role);
            List<Permission> permissionList = new ArrayList<Permission>();
            permissionList.add(permission);
            permissionList.add(permission1);
            role.setPermissions(permissionList);
            roleRepository.save(role);
            return role;
        }
        return null;
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User checkUser(String name, String password) {
        return userRepository.findByNameAndPassword(name, password);
    }
}
