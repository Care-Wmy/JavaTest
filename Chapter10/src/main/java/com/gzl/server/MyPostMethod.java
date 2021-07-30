package com.gzl.server;

import com.gzl.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Api(value = "/",description = "这是我全部的post请求")
@RequestMapping(value = "/v1")
public class MyPostMethod {

    //这个变量装cookie信息的
    private static Cookie cookie;

    //用户登录成功获取到cookies，在访问其他接口获取到列表
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登录接口，成功后获取cookie信息",httpMethod = "POST")
    public  String login(HttpServletResponse response,
                         @RequestParam(value ="userName",required = true) String userName,
                         @RequestParam(value ="password",required = true) String password){
            if (userName.equals("linlin") && password.equals("123456")){
                cookie = new Cookie("login","true");
                response.addCookie(cookie);
                return "登录成功";
            }
        return "用户名或者密码错误";
    }

    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表",httpMethod = "POST")
    private String getUserList(HttpServletRequest request,
                             @RequestBody User u){
        User user;
        //获取cookies
        Cookie[] cookies = request.getCookies();
        //验证cookies是否合法
        cookie = new Cookie("login","true");
        for (Cookie c : cookies){
            if (c.getName().equals("login") && c.getValue().equals("true") && u.getUserName().equals("paopao") && u.getPassword().equals("123456")){
                user = new User();
                user.setName("taotao");
                user.setAge("66");
                user.setSex("man");
                return user.toString();
            }
        }
        return "参数不合法";

    }
}
