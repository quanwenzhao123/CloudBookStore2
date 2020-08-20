package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dao.BookDao;
import com.qf.pojo.Book;
import com.qf.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public Map<String, Object> selectAllBooks(Integer page, Integer rows) {
        Map<String,Object> map = new HashMap<>();
        PageHelper.startPage(page,rows);
        List<Book> bookList = bookDao.selectAllBooks(page, rows);
        PageInfo<Book> pageInfo = new PageInfo<>(bookList);
        map.put("bookList",bookList);
        map.put("index",page);
        map.put("total",pageInfo.getTotal());
        map.put("totalPage",pageInfo.getPages());

        return map;
    }

    @Override
    public List<Book> likeBooks(String keyword) {
        return bookDao.likeBooks(keyword);
    }

    @Override
    public Book selectBookByBid(int bid) {
        return bookDao.selectBookByBid(bid);
    }
}
