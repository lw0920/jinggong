package com.qfedu.jinggong.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


/**
 *@Author feri
 *@Date Created in 2019/7/8 16:08
 */
@Configuration
public class SwaggerConfigOld {
    private ApiInfo createAI(){
        return new ApiInfoBuilder().title("晶宫装饰有限公司").description("网上简介").version("1.0")
                .contact(new Contact("Lw","http://1112","luwei@163.com")).build();
    }


    public void addAlllll(String naem){
        int a = 1;
        int b =2;
    }

    public void addAll(String naem){
        int a = 1;
        int b =2;
    }

    public void addAllll(String naem){
        int a = 1;
        int b =2;
    }
    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().apis
                (RequestHandlerSelectors.basePackage("com.qfedu.jinggong.controller")).build();
    }

}
