package com.example.mapper;

import com.example.entity.stu;
import org.jboss.logging.Param;

import java.util.List;

public interface Common {
    @Select("select count(*) from stu")
    public int gettstunumber( );

    @Select("select * from stu limit #{startRecord},#{pageSize}")
    public List<stu> stuinfo(@Param("startRecord")int startRecord, @Param("pageSize")int pageSize);
}
