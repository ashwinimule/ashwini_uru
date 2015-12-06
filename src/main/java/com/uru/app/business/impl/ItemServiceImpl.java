package com.uru.app.business.impl;

import java.util.List;

import javax.inject.Inject;

import com.uru.app.business.service.IItemService;
import com.uru.app.dao.IItemDao;
import com.uru.app.model.ItemModel;

public class ItemServiceImpl implements IItemService {

	@Inject
	IItemDao itemDao;
	
	public List<ItemModel> getAllItems() {
		
		return itemDao.findAll();
	}

	public ItemModel getItemById(Long id) {
		return itemDao.findById(id);
	}
	
	public boolean createItem(ItemModel itemData) {
		return itemDao.create(itemData);
	}

}
