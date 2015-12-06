package com.uru.app.dao;

import java.util.List;

import com.uru.app.entity.Attribute;
import com.uru.app.model.AttributeModel;

public interface IAttributeDao {

	public boolean create();

	public boolean update(Attribute attrEntity);

	public boolean delete(Attribute attrEntity);

	public AttributeModel findById(long id);

	public List<AttributeModel> findAll();

}
