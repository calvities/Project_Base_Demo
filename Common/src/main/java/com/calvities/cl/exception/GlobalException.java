package com.calvities.cl.exception;

import com.calvities.cl.result.Result;
import com.calvities.cl.result.ResultCodeEnum;
import com.calvities.cl.utils.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 统一异常处理器
 *
 * @Author CL
 * @Date 2020/12/25
 */
@Slf4j
@ControllerAdvice
public class GlobalException {

    /**
     * 拦截所有异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {
        log.error(ExceptionUtil.getMessage(e));
        return Result.error();
    }
    /**
     * 拦截SQL语句异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public Result error(BadSqlGrammarException e) {
        log.error(ExceptionUtil.getMessage(e));
        return Result.setResult(ResultCodeEnum.BAD_SQL_GRAMMAR);
    }

    /**
     * 拦截Json解析异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public Result error(HttpMessageNotReadableException e) {
        log.error(ExceptionUtil.getMessage(e));
        return Result.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
    }

    /**
     * 拦截自定义异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result error(CustomException e) {
        log.error(ExceptionUtil.getMessage(e));
        return Result.error().message(e.getMessage()).code(e.getCode());
    }
}
