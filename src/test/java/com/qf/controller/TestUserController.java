package com.qf.controller;

import com.qf.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: cbs
 * @description:
 * @author: 梓尤
 * @created: 2020/08/19 18:00
 */
@SpringBootTest
public class TestUserController {

    @Resource
    private UserController userController;

    @Test
    public void testGetAllUsers(){
        List<User> list = userController.getAllUsers();

        for (User user : list) {
            System.out.println("userController : " + user);
        }
    }
}
