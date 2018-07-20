package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity：@Table(name="")：表明这是一个实体类。
// 一般用于jpa这两个注解一般一块使用，但是如果表名和实体类名相同的话，@Table可以省略

@Entity

public class Person  {
    /**
     * @Id 表示主键
     * @GeneratedValue 主键生成策略
     *
     */

    @Id
    @GeneratedValue


    private Long id;

    private String name;

    private Integer age;

    private String address;

    private  String grader;

    private  String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrader() {
        return grader;
    }

    public void setGrader(String grader) {
        this.grader = grader;
    }
    //    public Person() {
//        super();
//    }
//
//    public Person(Long id, String name, Integer age, String address) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.address = address;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}