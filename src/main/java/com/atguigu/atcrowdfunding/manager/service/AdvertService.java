package com.atguigu.atcrowdfunding.manager.service;

import com.atguigu.atcrowdfunding.bean.Advert;
import com.atguigu.atcrowdfunding.util.Page;
import com.atguigu.atcrowfunding.vo.Data;

import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/2/2 0:54
 * @Version 1.0
 **/
public interface AdvertService {

    public Advert queryById(Integer id);

    public int deleteAdverts(Data ds);

    public int deleteAdvert(Integer id);

    public int updateAdvert(Advert advert);

    public int insertAdvert(Advert advert);

    public Page<Advert> pageQuery(Map<String, Object> advertMap);
}
