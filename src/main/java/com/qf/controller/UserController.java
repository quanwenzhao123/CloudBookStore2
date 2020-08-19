package com.qf.controller;


import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/User")
    public List<User> getAllUsers(){
        List<User> list = userService.getAllUsers();
        return list;
    }
}
