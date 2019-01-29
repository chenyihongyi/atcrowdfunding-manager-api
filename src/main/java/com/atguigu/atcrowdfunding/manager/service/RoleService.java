package com.atguigu.atcrowdfunding.manager.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.bean.Role;
import com.atguigu.atcrowdfunding.util.Page;
import com.atguigu.atcrowfunding.vo.Data;

 /**
 * @Author Elvis Chen
 * @Date 2019/1/21 23:09
 * @Version 1.0
 **/
public interface RoleService {

     public void saveRole(Role user);

     public int saveRolePermissionRelationship(Integer roleid, Data datas);

     public int batchDeleteRole(Data datas);

	 public int batchDeleteRole(Integer[] uid);

     public int deleteRole(Integer uid);

     public int updateRole(Role user);

     public Role getRole(Integer id);

     public Page<Role> pageQuery(Map<String, Object> paramMap);
 }
