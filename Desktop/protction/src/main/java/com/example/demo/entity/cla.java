package com.example.demo.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class cla {
    @RequestMapping(value = "/cla" , method = RequestMethod.GET)
    public String cla(String name , Integer age , String tel){
        studentbean student = new studentbean();
        student.setName("董建新");
        student.setAge(22);
        student.setTel("17340793083");
        return "姓名：" + student.name + "\t" + "年龄：" + student.age + "\t" + "联系方式：" + student.tel;

    }
}