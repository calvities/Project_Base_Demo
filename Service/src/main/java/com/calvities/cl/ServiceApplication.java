package com.calvities.cl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author CL
 * @Date 2020/12/25
 */
@SpringBootApplication
@MapperScan("com.calvities.cl.mapper")
public class ServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceApplication.class,args);
    }
}
