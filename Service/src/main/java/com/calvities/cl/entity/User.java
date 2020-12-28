package com.calvities.cl.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.calvities.cl.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author CL
 * @Date 2020/12/28
 */
@ApiModel(value = "com-calvities-cl-entity-User")
@Data
@TableName(value = "user")
public class User extends BaseEntity {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键ID")
    private String id;

    /**
     * 姓名
     */
    @TableField(value = "name")
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 性别(0男,1女,2未知)
     */
    @TableField(value = "sex")
    @ApiModelProperty(value = "性别(0男,1女,2未知)")
    private Integer sex;

    /**
     * 邮件地址
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "邮件地址")
    private String email;

    /**
     * 住址
     */
    @TableField(value = "address")
    @ApiModelProperty(value = "住址")
    private String address;

    /**
     * 逻辑删除 1（true）已删除， 0（false）未删除
     */
    @TableLogic
    @TableField(value = "is_delete",select = false)
    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    private Boolean deleted;


}