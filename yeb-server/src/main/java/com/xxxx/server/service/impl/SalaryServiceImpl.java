package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.server.mapper.SalaryMapper;
import com.xxxx.server.pojo.Salary;
import com.xxxx.server.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2020-10-15
 */
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary> implements ISalaryService {

    @Autowired
    private SalaryMapper salaryMapper;
    @Override
    public List<Salary> querySalary() {
        return salaryMapper.querySalary();
    }
}
