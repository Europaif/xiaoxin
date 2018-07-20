package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//在application里面设置数值
@RestController
public class test {
    @Value(value = "${inf.name}")
    private String infname;
    @Value("${inf.age}")
    private String infage;
    @Value("${inf.tel}")
    private String inftel;
    @RequestMapping("/xx")
    String index(){
        return "个人信息" + "\n" + "姓名：" + infname + "\n"+ "年龄:" + infage + "\n" +
                "联系方式："+inftel;
    }


}
