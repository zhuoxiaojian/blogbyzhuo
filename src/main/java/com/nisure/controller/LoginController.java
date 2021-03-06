package com.nisure.controller;

import com.nisure.domain.Role;
import com.nisure.domain.User;
import com.nisure.service.ILoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-03-26
 * Time: 16:58
 */
@Controller
public class LoginController {

    @Autowired
    private ILoginService loginService;

    //退出的时候是get请求，主要是用于退出
    @RequestMapping("/")
    public String login(){
        return "back/login";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "back/index";
    }

    @RequestMapping(value = "/welcome")
    public String welcome(){ return "back/welcome"; }


    //登出
    @RequestMapping(value = "/logout")
    public String logout(){
        return "back/login";
    }

    @RequestMapping(value = "/city")
    public String city(){
        return "back/city";
    }

    @RequestMapping(value="/admin-list")
    public String admin_list(){
        return "back/admin-list";
    }
    @RequestMapping(value="/admin-rule")
    public String admin_rule(){
        return "back/admin-rule";
    }
    @RequestMapping(value="/admin-role")
    public String admin_role(){
        return "back/admin-role";
    }

    @RequestMapping(value="/admin-edit")
    public String admin_edit(){
        return "back/admin-edit";
    }

    @RequestMapping(value="/admin-cate")
    public String admin_cate(){
        return "back/admin-cate";
    }
    @RequestMapping(value="/admin-add")
    public String admin_add(){
        return "back/admin-add";
    }

    @RequestMapping(value="/cate")
    public String cate(){
        return "back/cate";
    }
    @RequestMapping(value="/echarts1")
    public String echarts1(){
        return "back/echarts1";
    }
    @RequestMapping(value="/echarts2")
    public String echarts2(){
        return "back/echarts2";
    }
    @RequestMapping(value="/echarts3")
    public String echarts3(){
        return "back/echarts3";
    }
    @RequestMapping(value="/echarts4")
    public String echarts4(){
        return "back/echarts4";
    }
    @RequestMapping(value="/echarts5")
    public String echarts5(){
        return "back/echarts5";
    }
    @RequestMapping(value="/echarts6")
    public String echarts6(){
        return "back/echarts6";
    }
    @RequestMapping(value="/echarts7")
    public String echarts7(){
        return "back/echarts7";
    }
    @RequestMapping(value="/echarts8")
    public String echarts8(){
        return "back/echarts8";
    }

    @RequestMapping(value="/member-add")
    public String member_add(){
        return "back/member-add";
    }

    @RequestMapping(value="/member-del")
    public String member_del(){
        return "back/member-del";
    }

    @RequestMapping(value="/member-edit")
    public String member_edit(){
        return "back/member-edit";
    }
    @RequestMapping(value="/member-list")
    public String member_list(){
        return "back/member-list";
    }
    @RequestMapping(value="/member-list1")
    public String member_list1(){
        return "back/member-list1";
    }

    @RequestMapping(value="/member-password")
    public String member_password(){
        return "back/member-password";
    }

    @RequestMapping(value="/order-add")
    public String order_add(){
        return "back/order-add";
    }
    @RequestMapping(value="/order-list")
    public String order_list(){
        return "back/order-list";
    }

    @RequestMapping(value="/role-add")
    public String role_add(){
        return "back/role-add";
    }
    @RequestMapping(value="/unicode")
    public String unicode(){
        return "back/unicode";
    }


    @RequestMapping(value = "blog-index")
    public String blog_index(){
        return "blog/index";
    }
   /*
    //数据初始化
    @RequestMapping(value = "/addUser")
    public String addUser(@RequestBody Map<String,Object> map){
        User user = loginService.addUser(map);
        return "addUser is ok! \n" + user;
    }

    //角色初始化
    @RequestMapping(value = "/addRole")
    public String addRole(@RequestBody Map<String,Object> map){
        Role role = loginService.addRole(map);
        return "addRole is ok! \n" + role;
    }

    //注解的使用
    @RequiresRoles("admin")
    @RequiresPermissions("create")
    @RequestMapping(value = "/create")
    public String create(){
        return "Create success!";
    }*/
}
