package com.haidong.newseirmeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 20230724
 */
@MapperScan("com.haidong.newseirmeng.dao")
@SpringBootApplication
public class NewSeirmengApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewSeirmengApplication.class, args);
    }

}
