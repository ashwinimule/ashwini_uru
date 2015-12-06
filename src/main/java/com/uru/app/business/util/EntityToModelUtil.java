package com.uru.app.business.util;

import java.util.HashSet;
import java.util.Set;

import com.uru.app.entity.Attribute;
import com.uru.app.entity.AttributeValue;
import com.uru.app.entity.Item;
import com.uru.app.entity.ProductCatalog;
import com.uru.app.entity.ProductType;
import com.uru.app.model.AttributeModel;
import com.uru.app.model.AttributeValueModel;
import com.uru.app.model.ItemModel;
import com.uru.app.model.ProductCatalogModel;
import com.uru.app.model.ProductTypeModel;

public class EntityToModelUtil {

	public ProductCatalogModel convertProductCatalogToModel(ProductCatalog pcEntity) {
		ProductCatalogModel model = new ProductCatalogModel();
		model.setId(pcEntity.getId());
		model.setCatName(pcEntity.getCatName());
		model.setCatDescription(pcEntity.getCatDescription());

		Set<ProductCatalogModel> setSubCategories = new HashSet<ProductCatalogModel>();
		if(null != pcEntity.getSubCategories() && !pcEntity.getSubCategories().isEmpty()){
			for (ProductCatalog pClog : pcEntity.getSubCategories()) {
				ProductCatalogModel pcm = convertProductCatalogToModel(pClog);
				pcm.setParentCategory(model);
				setSubCategories.add(pcm);
			}
			model.setSubCategories(setSubCategories);
		}else {
			model.setSubCategories(null);
		}

		Set<ProductTypeModel> ptmSet = new HashSet<ProductTypeModel>();
		for (ProductType pt : pcEntity.getProductTypes()) {
			ProductTypeModel ptm = convertProductTypeToModel(pt);
			ptm.setProdCategory(model);
			ptmSet.add(ptm);
		}

		model.setProductTypes(ptmSet);

		return model;
	}

	public ProductTypeModel convertProductTypeToModel(ProductType prodType) {

		ProductTypeModel ptModel = new ProductTypeModel();
		
		ptModel.setId(prodType.getId());
		ptModel.setCreatedBy(prodType.getCreatedBy());
		ptModel.setCreatedDate(prodType.getCreatedDate());
		ptModel.setModifiedBy(prodType.getModifiedBy());
		ptModel.setModifiedDate(prodType.getModifiedDate());
		
		ptModel.setProdType(prodType.getProdType());
		ptModel.setProdTypeDesc(prodType.getProdTypeDesc());
		ptModel.setProdTypeLgImg(prodType.getProdTypeLgImg());
		ptModel.setProdTypeSmImg(prodType.getProdTypeSmImg());

		Set<ItemModel> itemModels = new HashSet<ItemModel>();
		if (null != prodType.getItems()) {
			for (Item item : prodType.getItems()) {
				ItemModel im = convertItemToModel(item);
				im.setProductType(ptModel);
				itemModels.add(im);
			}
		}

		ptModel.setItems(itemModels);
		
		Set<AttributeModel> amSet = new HashSet<AttributeModel>();
		if(null != prodType.getAttributes()){
			for(Attribute att : prodType.getAttributes()){
				AttributeModel am = convertAttToModel(att);
				am.setProductTypeModel(ptModel);
				amSet.add(am);
			}
			ptModel.setAttributes(amSet);
		}
		

		return ptModel;

	}
	
	public ItemModel convertItemToModel(Item item) {
		ItemModel model = new ItemModel();
		model.setId(item.getId());
		model.setItemName(item.getItemName());
		model.setItemDescription(item.getItemDescription());
		model.setCreatedBy(item.getCreatedBy());
		model.setCreatedDate(item.getCreatedDate());
		model.setLargeImg(item.getLargeImg());
		model.setModifiedBy(item.getModifiedBy());
		model.setModifiedDate(item.getModifiedDate());
		model.setSmallImg(item.getSmallImg());

		//if (null != item.getProductType())
			//model.setProductType(convertProductTypeToModel(item.getProductType()));

		Set<AttributeValueModel> attValueModels = new HashSet<AttributeValueModel>();

		if (null != item.getAttributeValues()) {
			for (AttributeValue attVal : item.getAttributeValues()) {
				
				AttributeValueModel avm = convertAttValueToModel(attVal);
				avm.setItem(model);
				attValueModels.add(avm);
			}
		}
		
		model.setAttValueModel(attValueModels);

		return model;

	}
	
	public AttributeValueModel convertAttValueToModel(AttributeValue attValue) {

		AttributeValueModel attValModel = new AttributeValueModel();
		
		attValModel.setId(attValue.getId());
		attValModel.setCreatedBy(attValue.getCreatedBy());
		attValModel.setCreatedDate(attValue.getCreatedDate());
		attValModel.setModifiedBy(attValue.getModifiedBy());
		attValModel.setModifiedDate(attValue.getModifiedDate());

		attValModel.setAttValue(attValue.getAttValue());
		attValModel.setAttribute(convertAttToModel(attValue.getAttribute()));

		return attValModel;

	}
	
	private AttributeModel convertAttToModel(Attribute attr) {

		AttributeModel attModel = new AttributeModel();
		
		attModel.setId(attr.getId());
		attModel.setCreatedBy(attr.getCreatedBy());
		attModel.setCreatedDate(attr.getCreatedDate());
		attModel.setModifiedBy(attr.getModifiedBy());
		attModel.setModifiedDate(attr.getModifiedDate());

		attModel.setAtrributeName(attr.getAtrributeName());
		attModel.setAtrributeType(attr.getAtrributeType());


		return attModel;

	}
}
