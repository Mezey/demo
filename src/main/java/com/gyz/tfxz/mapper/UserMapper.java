package com.gyz.tfxz.mapper;

import com.gyz.tfxz.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    /*
    * 用户登录
    * */
    User getByAccountAndPassword(User user);

    /*
     * 用户注册
     * */
    void insertUser(User user);

    /*
     * 用户修改密码
     * */
    void updatePassword(User user);
}
