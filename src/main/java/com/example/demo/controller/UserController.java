package com.example.demo.controller;

import com.example.demo.pojo.userDO.UserInfo;
import com.example.demo.service.Impl.UserServiceImpl;
import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Slf4j
@RequestMapping("/")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result logIn(@RequestParam String userName, @RequestParam String userPassword) {
        if(userService.userLogIn(userName,userPassword)){
            log.info("{} login success",userName);
            return Result.success(true,"登录成功");
        }else {
            return Result.error("-1","账号密码错误");
        }
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView logIn(){
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView register(){
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @PostMapping("/register")
    public Result<Boolean> register(@RequestBody UserInfo userInfo) {
        Boolean res;
        try {
            res = userService.userRegister(userInfo);
        } catch (Exception e) {
            return Result.error(String.valueOf(1), e.getMessage());
        }
        if (res) {
            return Result.success(true, "用户" + userInfo.getName() + "注册成功");
        } else {
            return Result.error(String.valueOf(1), "注册失败");
        }
    }
}
