package com.example.demo.service.Impl;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.pojo.userDO.UserInfo;
import com.example.demo.repository.UserDAO;
import com.example.demo.service.UserService;
import com.example.demo.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public Boolean userLogIn(String name, String password) {
        UserInfo res = userDAO.findByNameAndPassword(name, password);
        if (res == null) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean userRegister(UserInfo userInfo) throws Exception {
        if (userDAO.findByName(userInfo.getName()) != null) {
            throw new Exception("用户名已存在");
        }
        UserInfo res = userDAO.save(userInfo);
        if (res == null) {
            return false;
        }
        return true;
    }
}
