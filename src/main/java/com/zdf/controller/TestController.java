package com.zdf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.zdf.controller.webBean.TableParam;
import com.zdf.entity.shop.Product;
import com.zdf.services.ProductService;

@Controller
@RequestMapping(value="test")
public class TestController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="bootstrapTable")
	public String bootstrapTable(){
	System.out.println("bootstrapTable");
		return "test/table/bootstrap-table";
	}
	
	@RequestMapping(value={"list"},method = RequestMethod.GET)
	public JSONObject getTableData(TableParam param,Product product){
		System.out.println("param>>"+param);
		List<Product> resultList = productService.getList(product);
		System.out.println("resultList size>>"+resultList.size());
		return null;
	}

}
