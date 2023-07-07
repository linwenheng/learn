package com.example.demo.mapper;

import com.example.demo.pojo.userDO.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserInfoMapper {

    public List<UserInfo> selectUserInfo(String name,String password);
}
