package com.qf.service;


import com.qf.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class TestBookServive {

    @Resource
    private BookService bookService;

    @Test
    public void test(){
        List<Book> list = bookService.likeBooks("人");
        System.out.println(list);
    }
    @Test
    public void test01(){
        Map<String, Object> list = bookService.selectAllBooks(1,5);
        System.out.println(list);
    }
}
