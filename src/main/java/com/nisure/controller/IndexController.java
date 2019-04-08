package com.nisure.controller;

import com.nisure.domain.User;
import com.nisure.service.ILoginService;
import com.nisure.util.ResultData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-03-27
 * Time: 11:25
 */
@RestController
public class IndexController {
    @Autowired
    private ILoginService loginService;

    //    post登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultData login(@RequestBody Map map){
        String username = map.get("username").toString();
        String password = map.get("password").toString();
        User user = loginService.checkUser(username, password);
        if(null == user){
            return ResultData.ok().put("message", "用户或密码错误").put("status", 0);
        }
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                username,
                password);
        //进行验证，这里可以捕获异常，然后返回对应信息
        subject.login(usernamePasswordToken);
        return ResultData.ok().put("message", "登录成功").put("status", 1);
    }

    //注解的使用
    @RequiresRoles("admin")
    @RequiresPermissions("create")
    @RequestMapping(value = "/create")
    public String create(){
        return "Create success!";
    }
}
