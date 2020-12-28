package com.calvities.cl.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置
 * @Author CL
 * @Date 2020/12/25
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger2Config {

    @Bean
    public Docket webApiDocket() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("前端页面接口")
                .apiInfo(webApiInfo())
                .host("localhost:8888")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.calvities.cl.controller"))
                .paths(Predicates.and(PathSelectors.regex("/api/.*")))
                .build();
    }

    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder()
                .title("网站的API文档")
                .description("本文档描述网站的API接口定义")
                .contact(new Contact("CL","","707316053@qq.com"))
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }

}
