package com.uru.app.business.service;

import java.util.List;

import com.uru.app.model.ItemModel;

public interface IItemService {

	public List<ItemModel> getAllItems();

	public ItemModel getItemById(Long id);
	
	public boolean createItem(ItemModel itemData);
	
}
