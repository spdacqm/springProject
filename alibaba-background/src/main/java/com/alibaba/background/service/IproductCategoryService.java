package com.alibaba.background.service;

import java.util.List;

import com.alibaba.entity.ProductCategory;

public interface IproductCategoryService {

	List<ProductCategory> getProductCategoryById(Integer pid);

}
