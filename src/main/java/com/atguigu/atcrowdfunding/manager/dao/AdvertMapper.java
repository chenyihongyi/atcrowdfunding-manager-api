package com.atguigu.atcrowdfunding.manager.dao;

import com.atguigu.atcrowdfunding.bean.Advert;
import com.atguigu.atcrowfunding.vo.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/2/2 1:10
 * @Version 1.0
 **/
public interface AdvertMapper {

    Advert queryById(Integer id);

    int deleteAdverts(Data ds);

    int deleteAdvert(Integer id);

    int updateAdvert(Advert advert);

    int insertAdvert(Advert advert);

    List<Advert> pageQuery(Map<String, Object> paramMap);

    int queryCount(Map<String, Object> paramMap);
}
