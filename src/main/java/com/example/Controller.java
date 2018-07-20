package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @Autowired
    private Bookbean bookBean;

    @RequestMapping("/book")

    public String book() {
        return "姓名："+bookBean.getName()+"年龄："+bookBean.getAge()+"联系方式： "+bookBean.getTel();
    }
}