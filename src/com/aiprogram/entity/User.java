package com.aiprogram.entity;

import java.util.List;

/**
 * Created by 没想法的岁月 on 2018/4/3.
 */
public class User {
    private int id;
    private  String name;
//    private List<String> list;
//
//    public List<String> getList() {
//        return list;
//    }
//
//    public void setList(List<String> list) {
//        this.list = list;
//    }

    public  User(){}{}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
