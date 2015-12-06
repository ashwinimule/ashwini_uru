package com.uru.app.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.uru.app.business.service.IItemService;
import com.uru.app.model.ItemModel;

@Path("items")
@Produces(MediaType.APPLICATION_JSON)
public class ItemRestService {

	@Inject
	IItemService itemService;

	@GET
	@Path("allItems")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ItemModel> getAllItems() {
		return itemService.getAllItems();
	}
	
	@GET
	@Path("itemById")
	public ItemModel getItemById(@QueryParam("id") Long id) {
		return itemService.getItemById(id);
	}

	@POST
	@Path("createItem")
	public boolean createItem(ItemModel itemData) {
		return itemService.createItem(itemData);
	}
}
