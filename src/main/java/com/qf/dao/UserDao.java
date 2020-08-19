package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    //@Select("select * from user")
    List<User> getAllUsers();

    public User selectUserByUid(int uid);

    public int delete(int uid);

    public int update(User user);

    public int insert(User user);
}
