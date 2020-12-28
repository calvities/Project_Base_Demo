package com.calvities.cl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.calvities.cl.entity.User;
import com.calvities.cl.vo.UserQueryVO;

/**
 * @Author CL
 * @Date 2020/12/25
 */
public interface UserService extends IService<User> {


    /**
     * 多条件查询用户列表
     *
     * @param userPage    分页对象
     * @param userQueryVO 用户查询对象
     * @return
     */
    IPage<User> selectPage(Page<User> userPage, UserQueryVO userQueryVO);
}






