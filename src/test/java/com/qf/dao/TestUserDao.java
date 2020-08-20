package com.qf.dao;

import com.qf.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: cbs
 * @description:
 * @author: 梓尤
 * @created: 2020/08/19 17:49
 */

@SpringBootTest
public class TestUserDao {

    @Resource
    private UserDao userDao;

    @Test
    public void testGetAllUsers() {

        List<User> list = userDao.getAllUsers();

        //System.out.println(list);

        for (User user : list) {
            System.out.println("userDao : " + user);
        }

    }
}
