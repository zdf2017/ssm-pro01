package com.ssmsite.modules.shop.dao;

import java.util.List;

import com.ssmsite.modules.shop.entity.Product;

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