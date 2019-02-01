package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.Cert;
import com.atguigu.atcrowfunding.vo.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/2/1 20:52
 * @Version 1.0
 **/
public interface CertMapper {

    Cert queryById(Integer id);

    int deleteCerts(Data ds);

    int deleteCert(Integer id);

    int updateCert(Cert cert);

    void insertCert(Cert cert);

    List<Cert> pageQuery(Map<String, Object> paramMap);

    int queryCount(Map<String, Object> paramMap);
}
