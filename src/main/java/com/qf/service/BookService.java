package com.qf.service;

import com.qf.pojo.Book;

import java.util.List;
import java.util.Map;

public interface BookService {
    //查询所有
    Map<String, Object> selectAllBooks(Integer page, Integer rows);

    //模糊查询
    List<Book> likeBooks(String keyword);

    //详情查询
    Book selectBookByBid(int bid);

}
