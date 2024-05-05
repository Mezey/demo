package com.gyz.tfxz.controller;

import com.gyz.tfxz.pojo.Result;
import com.gyz.tfxz.pojo.User;
import com.gyz.tfxz.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /*
     * 用户登录
     * */
    @PostMapping("/login")
    public Result login(@RequestBody User user) {

        log.info("用户登录：{}", user.getAccountNumber());

        //接收service层返回来的结果
        User result = userService.login(user);
//        System.out.println(result);
        //校验登录是否成功
        if (result != null) {
            return Result.success("登录成功");
        } else {
            return Result.error("账号或密码错误");
        }

    }

    /*
    * 用户注册接口
    * */
    @PostMapping("/register")
    public Result addUser(@RequestBody User user) {

        log.info("注册用户：{}", user.getAccountNumber());

        userService.addUser(user);

        return Result.success("注册成功");
    }

    /*
    * 修改密码接口
    * */
    @PutMapping("/user/change")
    public Result changePassword(@RequestBody User user) {

        log.info("用户修改密码 --> 账号：{}, 密码：{}", user.getAccountNumber(), user.getPassword());

        userService.changePassword(user);
        return Result.success("密码修改成功");
    }

}
