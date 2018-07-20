package com.example.demo.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController

public class information {
    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    public  Object hello(String name1 , String tel1){
        Map<String , Object> retmap = new HashMap<>();
        name1 = "董建新";
        tel1 = "17340793083";
        retmap.put("姓名" , name1);
        retmap.put("年龄" , 22 );
        retmap.put("联系方式" , tel1);
        return retmap;
    }

}
