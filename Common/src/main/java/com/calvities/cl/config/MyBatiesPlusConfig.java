package com.calvities.cl.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatiesPlus 配置
 * @Author CL
 * @Date 2020/12/25
 */
@Configuration
@EnableTransactionManagement   // 事务处理
@MapperScan("com.calvities.cl.mapper")
public class MyBatiesPlusConfig {

//    @Bean
//    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
//        return new OptimisticLockerInterceptor();
//    }

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){

        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页操作，true调回到首页，false继续请求 默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大胆业限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启count的jion优化，只针对部分left jion
        paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));

        return paginationInterceptor;
    }
}
