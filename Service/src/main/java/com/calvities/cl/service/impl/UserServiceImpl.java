package com.calvities.cl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.calvities.cl.entity.User;
import com.calvities.cl.vo.UserQueryVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.calvities.cl.mapper.UserMapper;
import com.calvities.cl.service.UserService;

/**
 * @Author CL
 * @Date 2020/12/25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 多条件查询用户列表
     *
     * @param userPage    分页对象
     * @param userQueryVO 用户查询对象
     * @return
     */
    @Override
    public IPage<User> selectPage(Page<User> userPage, UserQueryVO userQueryVO) {

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>();

        if (userQueryVO == null) {

            return baseMapper.selectPage(userPage, userQueryWrapper);
        }

        String name = userQueryVO.getName();
        Integer sex = userQueryVO.getSex();
        String email = userQueryVO.getEmail();

        if (!StringUtils.isEmpty(name)) {
            userQueryWrapper.like("name", name);
        }

        if (sex != null) {
            userQueryWrapper.eq("sex", sex);
        }

        if (!StringUtils.isEmpty(email)) {

            userQueryWrapper.like("email", email);
        }

        return baseMapper.selectPage(userPage, userQueryWrapper);
    }
}






