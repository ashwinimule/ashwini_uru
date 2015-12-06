package com.uru.app.business.service;

import java.util.List;

import com.uru.app.model.ProductCatalogModel;
import com.uru.app.model.UruModel;


/**
 * Created by Rahul Dev
 */
public interface IUruBusinessService {

	public UruModel fetchUserDetails(String loginName);
	
	public List<ProductCatalogModel> getAllRootCategories();
	

}
