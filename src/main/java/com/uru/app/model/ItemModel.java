package com.uru.app.model;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

public class ItemModel extends MasterModel {

	private String itemName;
	private String itemDescription;
	private String smallImg;
	private String largeImg;
	
	@JsonBackReference
	private ProductTypeModel productType;
	
	@JsonManagedReference
	private Set<AttributeValueModel> attValueModel = new HashSet<AttributeValueModel>() ;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getSmallImg() {
		return smallImg;
	}

	public void setSmallImg(String smallImg) {
		this.smallImg = smallImg;
	}

	public String getLargeImg() {
		return largeImg;
	}

	public void setLargeImg(String largeImg) {
		this.largeImg = largeImg;
	}

	/**
	 * @return the productType
	 */
	public ProductTypeModel getProductType()
	{
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductTypeModel productType)
	{
		this.productType = productType;
	}

	/**
	 * @return the attValueModel
	 */
	public Set<AttributeValueModel> getAttValueModel()
	{
		return attValueModel;
	}

	/**
	 * @param attValueModel the attValueModel to set
	 */
	public void setAttValueModel(Set<AttributeValueModel> attValueModel)
	{
		this.attValueModel = attValueModel;
	}



}
