package com.qfedu.jinggong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qfedu.jinggong.dao")
@EnableSwagger2
public class JinggongApplication {

    public static void main(String[] args) {
        SpringApplication.run(JinggongApplication.class, args);
    }

}
