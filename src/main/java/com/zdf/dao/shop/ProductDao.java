package com.zdf.dao.shop;

import java.util.List;

import com.zdf.controller.webBean.TableParam;
import com.zdf.entity.shop.Product;

public interface ProductDao {
    int deleteByPrimaryKey(String proid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String proid);
    
    List<Product> findList(Product record);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    public List<Product> selectallList(Product record); 
}