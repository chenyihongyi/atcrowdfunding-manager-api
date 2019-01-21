package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.Role;
import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowfunding.vo.Data;
import org.apache.ibatis.annotations.Param;

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

	List<User> queryList(Map<String, Object> paramMap);

	Integer queryCount(Map<String, Object> paramMap);

    //int deleteBatchUserByVO(Data data);

    //int deleteBatchUserByVO(@Param("userList") List<User> userList);

    int deleteBatchUserByVO(List<User> userList);

    List<Role> queryAllRole();

    List<Integer> queryRoleByUserid(Integer id);

    int saveUserRoleRelationship(@Param("userid") Integer userid, @Param("data") Data data);

    int deleteUserRoleRelationship(@Param("userid") Integer userid, @Param("data") Data data);
}
