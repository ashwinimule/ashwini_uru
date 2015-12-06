package com.uru.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.uru.app.business.util.EntityToModelUtil;
import com.uru.app.business.util.ModelToEntityUtil;
import com.uru.app.common.MySQLURUDatabase;
import com.uru.app.dao.IProductCatalogDao;
import com.uru.app.entity.ProductCatalog;
import com.uru.app.model.ProductCatalogModel;


@Named("productCatalogDao")
@Dependent
public class ProductCatalogDaoImpl implements IProductCatalogDao {
	
	@Inject
	@MySQLURUDatabase
	EntityManager em;
	
	@Inject
	EntityToModelUtil e2m;
	
	@Inject
	ModelToEntityUtil m2e;

	@Override
	public boolean create(ProductCatalogModel pcModel)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ProductCatalogModel pcModel)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ProductCatalogModel pcModel)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductCatalogModel findById(long id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductCatalogModel> findAll()
	{
		Query query = em.createNamedQuery("findAllCategories", ProductCatalog.class);
		List<ProductCatalog> prodCat = query.getResultList();
		if (prodCat != null && prodCat.size() > 0) {
			List<ProductCatalogModel> models = new ArrayList<ProductCatalogModel>();
			for (ProductCatalog pc : prodCat) {
				models.add(e2m.convertProductCatalogToModel(pc));
			}
			return models;
		}
		return null;

	}

}
