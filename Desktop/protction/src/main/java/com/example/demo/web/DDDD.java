package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class DDDD {
    @RequestMapping(value = "/demo" , method = RequestMethod.GET)
    public Object demo(String name , String tel) {
        Map<String, Object> retMap = new HashMap<>();
        name = "董建新" ;
        tel = "17340793083";
        retMap.put("name", name);
        retMap.put("age", 22);
        retMap.put("tel", tel);
        return retMap;
    }
}
