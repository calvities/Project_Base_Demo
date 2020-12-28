package com.calvities.cl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.calvities.cl.entity.User;
import com.calvities.cl.result.Result;
import com.calvities.cl.service.UserService;
import com.calvities.cl.vo.UserQueryVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author CL
 * @Date 2020/12/25
 */
@Slf4j
@CrossOrigin
@RestController
@Api(tags = "用户管理")
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("list/{page}/{limit}")
    @ApiOperation(value = "分页条件查询所有讲师列表")
    public Result listPage(@ApiParam(value = "当前页码", required = true) @PathVariable Long page,
                           @ApiParam(value = "每页记录数", required = true) @PathVariable Long limit,
                           @ApiParam("查询对象") UserQueryVO userQueryVO){

        Page<User> userPage = new Page<User>(page,limit);

        IPage<User> pageModel = userService.selectPage(userPage, userQueryVO);

        return Result.ok().data("total",pageModel.getTotal()).data("list",pageModel.getRecords());
    }

    @PostMapping("save")
    @ApiOperation(value = "添加用户")
    public Result save(@ApiParam("用户对象") @RequestBody User user){

        userService.save(user);
        return Result.ok().message("保存成功");
    }


    @PutMapping("modify")
    @ApiOperation(value = "修改用户")
    public Result modify(@ApiParam("用户对象") @RequestBody User user){

        boolean isOk = userService.updateById(user);
        if (isOk) {
            return Result.ok().message("保存成功");
        }else {
            return Result.error().message("数据不存在");
        }
    }

    @GetMapping("get/{id}")
    @ApiOperation(value = "根据ID查询用户信息")
    public Result selectOne(@ApiParam("用户ID") @PathVariable String id){

        User user = userService.getById(id);

        if (user!= null){
            return Result.ok().data("list",user);
        }else {
            return Result.error().message("数据不存在");
        }
    }

    @DeleteMapping("remove/{id}")
    @ApiOperation(value = "根据ID删除用户信息",notes = "逻辑删除")
    public Result removeById(@ApiParam("用户ID") @PathVariable String id){

        boolean isOk = userService.removeById(id);

        if (isOk){
            return Result.ok().message("删除成功");
        }else {
            return Result.error().message("删除失败");
        }
    }

    @DeleteMapping("batch-remove/{id}")
    @ApiOperation(value = "根据ID删除用户列表",notes = "逻辑删除")
    public Result removeByIds(@ApiParam("用户ID") @RequestBody List<String> idList){

        boolean isOk = userService.removeByIds(idList);

        if (isOk){
            return Result.ok().message("删除成功");
        }else {
            return Result.error().message("删除失败");
        }
    }

    @GetMapping("/list/name/{key}")
    @ApiOperation(value = "跟关键字查询用户名称列表")
    public Result selectNameListByKey(@ApiParam(value = "关键字",required = true) @PathVariable String key){

        List<Map<String, Object>> nameList = userService.selectNameList(key);
        return Result.ok().data("nameList",nameList);
    }

}
