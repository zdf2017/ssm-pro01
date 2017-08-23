package com.ssmsite.modules.shop.services;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ssmsite.common.webUtils.TableParam;
import com.ssmsite.modules.shop.entity.Product;


public interface ProductService {
	public List<Product> getList(Product product,TableParam param);
	public PageInfo<Product> getPageList(Product product,TableParam param);
	public List<Product> getAllList(Product product);
}
