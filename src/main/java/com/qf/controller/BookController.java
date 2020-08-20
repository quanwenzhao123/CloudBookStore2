package com.qf.controller;

import com.qf.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;
    @PostMapping(value = "/selectAllBooks")
    public Map<String,Object> selectAllBooks(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "rows",defaultValue = "3") Integer rows
    ){
        // Map<String,Object> resultData = new HashMap<>();
        Map<String, Object> books = bookService.selectAllBooks(page, rows);
        return books;

    }


}
