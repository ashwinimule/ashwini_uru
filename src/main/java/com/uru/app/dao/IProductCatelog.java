package com.uru.app.dao;

import java.util.List;

import com.uru.app.entity.ProductCatalog;

public interface IProductCatelog {

	public boolean create();

	public boolean update(ProductCatalog pcEntity);

	public boolean delete(ProductCatalog pcEntity);

	public ProductCatalog findById(long id);

	public List<ProductCatalog> findAll();

}
