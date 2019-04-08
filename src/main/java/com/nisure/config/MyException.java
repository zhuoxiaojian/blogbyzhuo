package com.nisure.config;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-04-08
 * Time: 10:54
 */
@ControllerAdvice
public class MyException {
    @ExceptionHandler(value = AuthorizationException.class)
    public void defaultErrorHandler(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("-----无角色异常----");
        response.sendRedirect("/error");
    }
}
