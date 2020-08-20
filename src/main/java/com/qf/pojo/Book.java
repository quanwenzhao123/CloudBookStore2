package com.qf.pojo;

import lombok.Data;

@Data
public class Book {
    private Integer bid;
    private String cover;
    private String title;
    private String author;
    private String date;
    private String press;
    private String abs;
    private Double price;

}
