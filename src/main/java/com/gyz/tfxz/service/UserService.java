package com.gyz.tfxz.service;


import com.gyz.tfxz.pojo.User;

public interface UserService {

    /*
    * 用户登录
    * */
    User login(User user);
    /*
     * 用户注册
     * */
    void addUser(User user);

    /*
     *用户修改密码
     * */
    void changePassword(User user);
}

