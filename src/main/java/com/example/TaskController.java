package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    ConnectionSettings conn;

    @RequestMapping(value = {"/",""})
    public String hellTask(){
        return conn.getUsername() + conn.getRemoteAddress() + conn.getRemoteAddress();
    }
}