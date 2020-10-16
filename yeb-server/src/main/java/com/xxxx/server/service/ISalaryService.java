package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Salary;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2020-10-15
 */
public interface ISalaryService extends IService<Salary> {

    //查询所有的salary
    List<Salary> querySalary();
}
