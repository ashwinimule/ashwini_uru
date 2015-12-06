package com.uru.app.dao;

import java.util.List;

import com.uru.app.model.ProductCatalogModel;

public interface IProductCatalogDao {

	public boolean create(ProductCatalogModel pcModel);

	public boolean update(ProductCatalogModel pcModel);

	public boolean delete(ProductCatalogModel pcModel);

	public ProductCatalogModel findById(long id);

	public List<ProductCatalogModel> findAll();

}
