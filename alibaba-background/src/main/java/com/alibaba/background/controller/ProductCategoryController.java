package com.alibaba.background.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.background.service.IproductCategoryService;
import com.alibaba.entity.ProductCategory;


@Controller
@RequestMapping("productCategoryController")
public class ProductCategoryController {
	
	@Autowired
	private IproductCategoryService productCategoryService;
	
	@RequestMapping("getProductCategoryById/{id}")
	public String getProductCategoryById(HttpServletRequest request,@PathVariable("id")String pid) {
		List<ProductCategory> productCategorys =  productCategoryService.getProductCategoryById(pid);
		
		
		return null;
	}
	
	
	
}
