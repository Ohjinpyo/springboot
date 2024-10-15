package com.example.stepspring.config;

import com.example.stepspring.jdbc.MyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardAutoConfiguration {

    @Bean
    public MyDataSource getMyDataSource(){
        MyDataSource dataSource = new MyDataSource();
        dataSource.setDriverClass("oracle.jdbc.driver.OravleDriver");
        dataSource.setUrl("jdbc:oracle:thim:@localhost:1521:xe");
        dataSource.setUsername("hr");
        dataSource.setPassword("hr");
        return dataSource;
    }
}
