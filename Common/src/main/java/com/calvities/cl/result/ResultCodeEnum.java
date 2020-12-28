package com.calvities.cl.result;

import lombok.Getter;
import lombok.ToString;

/**
 * 统一返回消息类型
 * @author CL
 * @since 2020/12/25
 */
@Getter
@ToString
public enum ResultCodeEnum {

    /**
     * 成功
     */
    SUCCESS(true, 20000,"成功"),
    /**
     * 未知错误
     */
    UNKNOWN_REASON(false, 20001, "未知错误"),
    /**
     * sql语法错误
     */
    BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),
    /**
     * json解析异常
     */
    JSON_PARSE_ERROR(false, 21002, "json解析异常"),
    /**
     * 参数不正确
     */
    PARAM_ERROR(false, 21003, "参数不正确"),
    /**
     * 文件上传错误
     */
    FILE_UPLOAD_ERROR(false, 21004, "文件上传错误"),
    /**
     * 文件刪除错误
     */
    FILE_DELETE_ERROR(false, 21005, "文件刪除错误"),
    /**
     * Excel数据导入错误
     */
    EXCEL_DATA_IMPORT_ERROR(false, 21006, "Excel数据导入错误"),
    /**
     * URL编码失败
     */
    URL_ENCODE_ERROR(false, 23001, "URL编码失败"),
    /**
     * 非法回调请求
     */
    ILLEGAL_CALLBACK_REQUEST_ERROR(false, 23002, "非法回调请求"),
    /**
     * 获取accessToken失败
     */
    FETCH_ACCESSTOKEN_FAILD(false, 23003, "获取accessToken失败"),
    /**
     * 获取用户信息失败
     */
    FETCH_USERINFO_ERROR(false, 23004, "获取用户信息失败"),
    /**
     * 登录失败
     */
    LOGIN_ERROR(false, 23005, "登录失败"),
    /**
     * 支付中
     */
    PAY_RUN(false, 25000, "支付中"),
    /**
     * 服务不能访问
     */
    GATEWAY_ERROR(false, 26000, "服务不能访问"),
    /**
     * 验证码错误
     */
    CODE_ERROR(false, 28000, "验证码错误"),
    /**
     * 手机号码不正确
     */
    LOGIN_PHONE_ERROR(false, 28009, "手机号码不正确"),
    /**
     * 账号不正确
     */
    LOGIN_MOBILE_ERROR(false, 28001, "账号不正确"),
    /**
     * 密码不正确
     */
    LOGIN_PASSWORD_ERROR(false, 28008, "密码不正确"),
    /**
     * 该用户已被禁用
     */
    LOGIN_DISABLED_ERROR(false, 28002, "该用户已被禁用"),
    /**
     * 手机号已被注册
     */
    REGISTER_MOBLE_ERROR(false, 28003, "手机号已被注册"),
    /**
     * 需要登录
     */
    LOGIN_AUTH(false, 28004, "需要登录"),
    /**
     * 没有权限
     */
    LOGIN_ACL(false, 28005, "没有权限"),
    /**
     * 短信发送失败
     */
    SMS_SEND_ERROR(false, 28006, "短信发送失败"),
    /**
     * 短信发送过于频繁
     */
    SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL(false, 28007, "短信发送过于频繁");


    private Boolean success;

    private Integer code;

    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
