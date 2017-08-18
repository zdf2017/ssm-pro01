package com.zdf.services;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zdf.controller.webUtils.TableParam;
import com.zdf.entity.shop.Product;


public interface ProductService {
	public List<Product> getList(Product product,TableParam param);
	public PageInfo<Product> getPageList(Product product,TableParam param);
	public List<Product> getAllList(Product product);
}
