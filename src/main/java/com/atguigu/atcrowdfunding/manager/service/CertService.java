package com.atguigu.atcrowdfunding.manager.service;

import com.atguigu.atcrowdfunding.bean.Cert;
import com.atguigu.atcrowdfunding.util.Page;
import com.atguigu.atcrowfunding.vo.Data;

import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/2/1 20:31
 * @Version 1.0
 **/
public interface CertService {

    public Cert queryById(Integer id);

    public int deleteCerts(Data ds);

    public int deleteCert(Integer id);

    public int updateCert(Cert cert);

    public void insertCert(Cert cert);

    public Page<Cert> pageQuery(Map<String, Object> paramMap);
}
