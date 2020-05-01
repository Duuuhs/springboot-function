package com.duuuhs.multipledatasources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.duuuhs.multipledatasources.dao")
public class MultipledatasourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultipledatasourcesApplication.class, args);
    }

}
