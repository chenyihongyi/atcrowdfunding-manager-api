package com.atguigu.atcrowdfunding.manager.service;

import com.atguigu.atcrowdfunding.bean.Role;
import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.util.Page;
import com.atguigu.atcrowfunding.vo.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/1/12 1:48
 * @Version 1.0
 **/
public interface UserService {

    User queryUserlogin(Map<String, Object> paramMap);

    int saveUser(User user);

    Page queryPage(Map<String, Object> paramMap);

    User getUserById(Integer id);

    int updateUser(User user);

    int deleteUser(Integer id);

    int deleteBatchUser(Integer[] ids);

    int deleteBatchUserByVO(Data data);

    List<Role> queryAllRole();

    List<Integer> queryRoleByUserid(Integer id);

    int saveUserRoleRelationship(Integer userid, Data data);

    int deleteUserRoleRelationship(Integer userid, Data data);
}
