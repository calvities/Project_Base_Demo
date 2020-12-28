package com.calvities.cl.handle;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * MyBatiesPlus 自动加载创建和更新时间
 * @Author CL
 * @Date 2020/12/25
 */
@Slf4j
@Component
public class MyBatiesPlusHandle implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {

        log.info("start insert fill...");
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("modifyTime", new Date(), metaObject);

    }

    @Override
    public void updateFill(MetaObject metaObject) {

        log.info("start insert fill...");
        this.setFieldValByName("modifyTime", new Date(), metaObject);
    }
}
