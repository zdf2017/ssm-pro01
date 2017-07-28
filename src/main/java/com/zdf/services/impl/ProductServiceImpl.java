package com.zdf.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zdf.controller.webBean.TableParam;
import com.zdf.dao.shop.ProductDao;
import com.zdf.entity.shop.Product;
import com.zdf.services.ProductService;

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
	    PageHelper.orderBy("createdStamp desc"); 
	    List<Product> list = productDao.selectallList(product);
	     PageInfo<Product> pageInfo = new PageInfo<Product>(list); 
		return pageInfo;
	}

	public List<Product> getAllList(Product product) {
		return productDao.selectallList(product);
	}

}
