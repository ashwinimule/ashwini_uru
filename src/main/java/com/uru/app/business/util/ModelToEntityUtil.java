package com.uru.app.business.util;

import java.util.HashSet;
import java.util.Set;

import com.uru.app.business.exception.UruApplicationException;
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

public class ModelToEntityUtil {


	public ProductCatalog convertProductCatalogToEntity(
			ProductCatalogModel model) {

		ProductCatalog pcEntity = new ProductCatalog();
		pcEntity.setCatName(model.getCatName());
		pcEntity.setCatDescription(model.getCatDescription());
		
		Set<ProductCatalog> subCateSet = new HashSet<ProductCatalog>();

		if (model.getSubCategories() != null
				&& model.getSubCategories().size() > 0) {
			for(ProductCatalogModel pcm : model.getSubCategories()){
				ProductCatalog pc = convertProductCatalogToEntity(pcm);
				pc.setParentCategory(pcEntity);
				subCateSet.add(pc);
			}
			pcEntity.setSubCategories(subCateSet);
		}else{
			pcEntity.setSubCategories(null);
		}

		if (model.getProductTypes() != null
				&& model.getProductTypes().size() > 0) {

			Set<ProductType> prodTypeEntities = new HashSet<ProductType>();
			for (ProductTypeModel prodTypeModel : model.getProductTypes()) {
				ProductType pt = convertProductTypeModelToEntity(prodTypeModel);
				pt.setProdCategory(pcEntity);
				prodTypeEntities.add(pt);
			}
			pcEntity.setProductTypes(prodTypeEntities);
		}
		return pcEntity;
	}
	
	public ProductType convertProductTypeModelToEntity(ProductTypeModel model) {
		ProductType prodType = new ProductType();
		//prodType.setId(model.getId());
		prodType.setProdType(model.getProdType());
		prodType.setProdTypeDesc(model.getProdTypeDesc());
		
		if(null != model.getItems() &&  !model.getItems().isEmpty()){
			Set<Item> itemSet = new HashSet<Item>();
			
			for(ItemModel imM : model.getItems()){
				Item im = convertItemModelToEntity(imM);
				im.setProductType(prodType);
				itemSet.add(im);
			}
			prodType.setItems(itemSet);
		}
		
		if (model.getAttributes() != null && model.getAttributes().size() > 0) {
			Set<Attribute> attributes = new HashSet<Attribute>();
			for(AttributeModel attrModel : model.getAttributes()) {
				Attribute attrEntity = convertAttrModelToEntity(attrModel);
				attrEntity.setProductType(prodType);
				attributes.add(attrEntity);
			}
			prodType.setAttributes(attributes);
		}

		return prodType;
	}


	public Item convertItemModelToEntity(ItemModel model) {
		Item item = new Item();
		item.setItemName(model.getItemName());
		item.setItemDescription(model.getItemDescription());
		item.setLargeImg(model.getLargeImg());
		item.setSmallImg(model.getSmallImg());

		if(model.getAttValueModel() != null  && model.getAttValueModel().size() > 0) {
			Set<AttributeValue> attrValues = new HashSet<AttributeValue>();
			for(AttributeValueModel attrVal : model.getAttValueModel()) {
				AttributeValue val = convertAttrValueModelToEntity(attrVal);
				val.setItem(item);
				attrValues.add(val);
			}
			item.setAttributeValues(attrValues);
		}
		
		return item;
	}
	
	public AttributeValue convertAttrValueModelToEntity(AttributeValueModel attValModel) {
		AttributeValue attrValueEntity = new AttributeValue();
		attrValueEntity.setAttValue(attValModel.getAttValue());
		attrValueEntity.setAttribute(convertAttrModelToEntity(attValModel.getAttribute()));
		return attrValueEntity;
	}
	
	
	
	public Attribute convertAttrModelToEntity(AttributeModel attModel) {
		Attribute attrEntity = new Attribute();
		attrEntity.setAtrributeName(attModel.getAtrributeName());
		attrEntity.setAtrributeType(attModel.getAtrributeType());
		
		return attrEntity;
	}
	
	
	
}
