package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class SpringBootSampleMysqlApplication {

    @Autowired
    PersonRepository dao;

    @RequestMapping("/get")
    public Person getP(String name){
        Person person = dao.findByName(name).get(0);//??????
        return person;
    }

    @RequestMapping("/getid")
    public List<Person> getid(long id){
        List<Person> all = dao.findById(id);
        return  all;
    }

    @RequestMapping("/find")
    public List<Person> getByAddress(String address){
        List<Person> list = dao.findByAddress(address);
        return list;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleMysqlApplication.class, args);
    }
}