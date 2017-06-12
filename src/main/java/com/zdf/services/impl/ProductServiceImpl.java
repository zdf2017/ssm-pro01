package com.zdf.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zdf.dao.shop.ProductDao;
import com.zdf.entity.shop.Product;
import com.zdf.services.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource  
	private ProductDao productDao;
	
	public List<Product> getList(Product product) {
		return productDao.findList(product);
	}

}
