package com.gyz.tfxz.service.impl;

import com.gyz.tfxz.mapper.UserMapper;
import com.gyz.tfxz.pojo.User;
import com.gyz.tfxz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    /*
    * 用户登录
    * */
    @Override
    public User login(User user) {

        //调用mapper层功能：登录
        User userLoign = userMapper.getByAccountAndPassword(user);

        //返回查询结果给controller
        return userLoign;
    }

    /*
    * 用户注册
    * */
    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    /*
    * 用户修改密码
    * */
    @Override
    public void changePassword(User user) {
        userMapper.updatePassword(user);
    }
}
