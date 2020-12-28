package com.calvities.cl.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author CL
 * @Date 2020/12/25
 */
@Data
@ApiModel("User 查询对象")
public class UserQueryVO {

    /**
     * 姓名
     */
    @ApiModelProperty(value="姓名")
    private String name;

    /**
     * 性别(0男,1女,2未知)
     */
    @ApiModelProperty(value="性别(0男,1女,2未知)")
    private Integer sex;

    /**
     * 邮件地址
     */
    @ApiModelProperty(value="邮件地址")
    private String email;
}
