package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.Role;
import com.atguigu.atcrowdfunding.bean.RolePermission;
import com.atguigu.atcrowfunding.vo.Data;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/1/22 3:20
 * @Version 1.0
 **/
public interface RoleMapper {

    void insert(Role user);

     void deleteRolePermissionRelationship(Integer roleid);

     int insertRolePermission(RolePermission rp);

     int batchDelete(@Param("ids") Integer[] uid);

	 int batchDeleteObj(Data datas);

     int delete(Integer uid);

     int update(Role user);

     Role getRole(Integer id);

     List<Role> pageQuery(Map<String, Object> paramMap);

     int queryCount(Map<String, Object> paramMap);
}
