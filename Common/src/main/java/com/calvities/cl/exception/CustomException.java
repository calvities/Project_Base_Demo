package com.calvities.cl.exception;

import com.calvities.cl.result.ResultCodeEnum;
import lombok.Data;

/**
 * @Author CL
 * @Date 2020/12/25
 */
@Data
public class CustomException extends RuntimeException {
    private Integer code;

    public CustomException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public CustomException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {

        return "CustomException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
