package com.qf.service;

import com.qf.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TestUserService {

    @Resource
    private UserService userService;

    @Test
    public void testGetAllUsers(){

        List<User> list = userService.getAllUsers();

        for (User user : list) {
            System.out.println("userService : " + user);
        }
    }


}
