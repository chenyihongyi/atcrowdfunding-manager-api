package com.atguigu.atcrowdfunding.manager.service;

import com.atguigu.atcrowdfunding.bean.User;

import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/1/12 1:48
 * @Version 1.0
 **/
public interface UserService {

    User queryUserlogin(Map<String, Object> paramMap);
}
