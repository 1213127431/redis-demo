package com.tj.redis.demo.controller;

import com.tj.redis.demo.entity.User;
import com.tj.redis.demo.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author tanggege
 * @date 2021-02-10 19:44
 */
@RestController
public class UserController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public String set() {
        User user = new User(1, "david", "123");
        redisUtil.set("user", user);
        return "success saved user !";
    }

    @RequestMapping("/get")
    public String get() {
        User user = (User) redisUtil.get("user");
        return user == null ? "null" : user.toString();
    }
}
