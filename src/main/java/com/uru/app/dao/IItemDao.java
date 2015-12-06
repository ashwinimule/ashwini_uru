package com.uru.app.dao;

import java.util.List;

import com.uru.app.model.ItemModel;

public interface IItemDao {

	public boolean create(ItemModel itemData);

	public boolean update(ItemModel itemData);

	public boolean delete(ItemModel itemData);

	public ItemModel findById(long id);

	public List<ItemModel> findAll();

	
}
