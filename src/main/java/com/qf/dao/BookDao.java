package com.qf.dao;


import com.qf.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    //查询所有
    List<Book> selectAllBooks(Integer page,Integer rows);

    //模糊查询
    List<Book> likeBooks(String keyword);

    //详情查询
    Book selectBookByBid(int bid);
}
