package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/1/11 20:40
 * @Version 1.0
 **/
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    List<User> selectAll();

    User queryUserlogin(Map<String, Object> paramMap);

}
