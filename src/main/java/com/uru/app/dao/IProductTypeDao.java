package com.uru.app.dao;

import java.util.List;

import com.uru.app.entity.ProductType;

public interface IProductTypeDao {

	public boolean create();

	public boolean update(ProductType prodTypeEntity);

	public boolean delete(ProductType prodTypeEntity);

	public ProductType findById(long id);

	public List<ProductType> findAll();

}
