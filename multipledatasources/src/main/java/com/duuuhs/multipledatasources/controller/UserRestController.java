package com.duuuhs.multipledatasources.controller;

import com.duuuhs.multipledatasources.model.User;
import com.duuuhs.multipledatasources.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Duuuhs
 * @description
 * @create 2020/4/29 23:19
 */
@RestController
@RequestMapping(value = "/api")
public class UserRestController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean insert(@RequestBody User user) {
        System.out.println("开始新增...");
        return userService.insert(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean update(@RequestBody User user) {
        System.out.println("开始更新...");
        return userService.update(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestBody User user)  {
        System.out.println("开始删除...");
        return userService.delete(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findByUser(User user) {
        System.out.println("开始查询...");
        List<User> byListEntity = userService.findByListEntity(user);
        return byListEntity;
    }

    @RequestMapping(value = "/userId", method = RequestMethod.GET)
    public User findByUserId(Integer userId) {
        System.out.println("开始查询...");
        User user = userService.findByPrimaryKey(userId);
        return user;
    }

}

