package com.calvities.cl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.calvities.cl.entity.User;
import com.calvities.cl.vo.UserQueryVO;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据关键字查询用户列表
     * @param key 关键字
     * @return 用户姓名
     */
    List<Map<String, Object>> selectNameList(String key);
}






