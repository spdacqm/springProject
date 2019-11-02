package com.alibaba.background.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.background.service.IproductCategoryService;
import com.alibaba.entity.ProductCategory;


@Controller
@RequestMapping("productCategoryController")
public class ProductCategoryController {
	
	@Autowired
	private IproductCategoryService productCategoryService;
	
	@ResponseBody
	//这个的作用有将数据转化为json格式的作用？？？？？
	@RequestMapping("getProductCategoryById/{id}")
	public List<ProductCategory> getProductCategoryById(HttpServletRequest request,@PathVariable("id")Integer pid) {
		
		List<ProductCategory> productCategorys =  productCategoryService.getProductCategoryById(pid);
		
//		Gosn go = new
		
		
		return productCategorys;
	}
	
	
	
}
