package com.example.service;

import com.example.entity.stu;
import com.example.mapper.Common;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommonService {
    @Autowired
    public Common commonmapper;

    public int gettstunumber( ){
        return commonmapper.gettstunumber();
    }
    public List<stu> stuinfo(int startRecord, int pageSize){
        return commonmapper.stuinfo(startRecord, pageSize);
    }
}
