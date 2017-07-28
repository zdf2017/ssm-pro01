package com.zdf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zdf.controller.webBean.TableParam;
import com.zdf.controller.webBean.TableResult;
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
	@ResponseBody
	public TableResult<Product> getTableData(TableParam param,Product product){
		System.out.println("param>>"+param);
		List<Product> resultList = productService.getList(product,param);
		PageInfo<Product> pageList = productService.getPageList(product, param);
		TableResult<Product> tableResult = new TableResult<Product>();
		tableResult.setRows(resultList);
		tableResult.setTotal(resultList.size()); 
		System.out.println("resultList size>>"+resultList.size());
		return tableResult;
	}
	
	@RequestMapping(value={"page"},method = RequestMethod.GET)
	@ResponseBody
	public TableResult<Product> getTablePage(TableParam param,Product product){	
		PageHelper.startPage(param.getPageIndex(), param.getLimit());
		List<Product> list = productService.getAllList(product);
		PageInfo<Product> p = new PageInfo<Product>(list);
		TableResult<Product> tableResult = new TableResult<Product>();
		tableResult.setRows(p.getList());
		tableResult.setTotal(p.getTotal()); 
		return tableResult;
	}

}
