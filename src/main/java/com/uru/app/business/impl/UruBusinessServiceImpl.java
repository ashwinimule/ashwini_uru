package com.uru.app.business.impl;

import java.util.List;

import javax.ejb.AccessTimeout;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.uru.app.business.service.IUruBusinessService;
import com.uru.app.dao.IUruDao;
import com.uru.app.dao.impl.ProductCatalogDaoImpl;
import com.uru.app.model.ProductCatalogModel;
import com.uru.app.model.UruModel;

/**
 * Created by Rahul Dev
 */
@javax.ejb.Singleton
@AccessTimeout(value = 20000)
@TransactionManagement(TransactionManagementType.CONTAINER)
public class UruBusinessServiceImpl implements IUruBusinessService {
	
	@Inject
	@Named("uruDao")
	IUruDao uruDao;
	
	@Inject
	@Named("productCatalogDao")
	ProductCatalogDaoImpl productCatalogDao;
	
	

	@Override
	@Transactional
	public UruModel fetchUserDetails(String loginName) {
		return uruDao.fetchUserDetails(loginName);
	}



	@Override
	@Transactional
	public List<ProductCatalogModel> getAllRootCategories()
	{
		return productCatalogDao.findAll();
	}


}
