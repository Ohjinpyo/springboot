package com.example.stepspring.jdbc;

import lombok.Data;

@Data
public class MyDataSource {
    private String driverClass;
    private String url;
    private String username;
    private String password;

    public MyDataSource(){
        System.out.println("==> MyDataSource 생성");
    }
}
