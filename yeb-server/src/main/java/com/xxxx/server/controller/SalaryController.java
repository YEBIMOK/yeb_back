package com.xxxx.server.controller;


import com.xxxx.server.pojo.Salary;
import com.xxxx.server.service.impl.SalaryServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhoubin
 * @since 2020-10-15
 */
@RestController
@RequestMapping("/salary")
public class SalaryController {

    @Resource
    private SalaryServiceImpl salaryService;

    @ApiOperation("查询所有的salary")
    @GetMapping("/sob")
    public List<Salary> querySalary(){
        return salaryService.querySalary();
    }
}
