package com.example.demo.service;

import com.example.demo.pojo.userDO.UserInfo;
import com.example.demo.utils.Result;

public interface UserService {
    Boolean userLogIn(String name,String password);

    Boolean userRegister(UserInfo userInfo) throws Exception;
}
