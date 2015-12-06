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
import com.uru.app.business.service.IUruBusinessService;
import com.uru.app.model.ItemModel;
import com.uru.app.model.ProductCatalogModel;

@Path("prodCategory")
@Produces(MediaType.APPLICATION_JSON)
public class ProductCatalogRestService {

	@Inject
	IItemService itemService;
	
	@Inject
	IUruBusinessService uruService;

	@GET
	@Path("getAllRootCategories")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductCatalogModel> getAllRootCategories() {
		return uruService.getAllRootCategories();
	}
	
}
