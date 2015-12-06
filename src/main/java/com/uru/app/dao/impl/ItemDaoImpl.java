package com.uru.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.uru.app.business.exception.UruApplicationException;
import com.uru.app.business.util.EntityToModelUtil;
import com.uru.app.business.util.ModelToEntityUtil;
import com.uru.app.common.MySQLURUDatabase;
import com.uru.app.dao.IItemDao;
import com.uru.app.entity.Item;
import com.uru.app.model.ItemModel;

public class ItemDaoImpl implements IItemDao {

	@Inject
	@MySQLURUDatabase
	EntityManager em;
	
	@Inject
	EntityToModelUtil e2m;
	
	@Inject
	ModelToEntityUtil m2e;

	public boolean create(ItemModel itemData) {
		
		if(itemData == null) {
			throw new UruApplicationException("Illegal item data. Item creation failed.");
		}
		Item entity = m2e.convertItemModelToEntity(itemData);
		em.persist(entity);
		return true;
	}

	public boolean update(ItemModel itemData) {
		
		
		
		return true;
	}

	public boolean delete(ItemModel itemData) {
		
		
		
		return true;
	}

	public ItemModel findById(long id) {
		Query query = em.createNamedQuery("findItemById", Item.class);
		//query.setParameter("id", id);
		Item item = (Item)query.getSingleResult();
				
			return e2m.convertItemToModel(item);
	}

	public List<ItemModel> findAll() {
		Query query = em.createNamedQuery("findAllItems", Item.class);
		List<Item> items = query.getResultList();
		if (items != null && items.size() > 0) {
			List<ItemModel> models = new ArrayList<ItemModel>();
			for (Item item : items) {
				models.add(e2m.convertItemToModel(item));
			}
			return models;
		}
		return null;
	}

}
