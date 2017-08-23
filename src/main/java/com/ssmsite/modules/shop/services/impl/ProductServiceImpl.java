package com.ssmsite.modules.shop.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmsite.common.webUtils.TableParam;
import com.ssmsite.modules.shop.dao.ProductDao;
import com.ssmsite.modules.shop.entity.Product;
import com.ssmsite.modules.shop.services.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource  
	private ProductDao productDao;
	
	public List<Product> getList(Product product,TableParam param) {
		System.out.println("proId>>"+product.getProid());
		//return productDao.findList(product);
		return productDao.selectallList(product);
	}

	public PageInfo<Product> getPageList(Product product, TableParam param) {
		PageHelper.startPage(param.getPageIndex(), param.getSize()); 
	    
	    List<Product> list = productDao.selectallList(product);
	     PageInfo<Product> pageInfo = new PageInfo<Product>(list); 
		return pageInfo;
	}

	public List<Product> getAllList(Product product) {
		return productDao.selectallList(product);
	}

}
