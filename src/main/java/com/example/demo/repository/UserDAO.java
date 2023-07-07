package com.example.demo.repository;

import com.example.demo.pojo.userDO.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaRepository<UserInfo,Integer> {
    UserInfo findByNameAndPassword(String name,String password);
    UserInfo findByName(String name);
}
