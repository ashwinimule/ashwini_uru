package com.uru.app.model;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonBackReference;

public class AttributeModel extends MasterModel {

	private String atrributeName;
	private String atrributeType;
	
	@JsonBackReference
	private ProductTypeModel productTypeModel;
	
	private Set<AttributeValueModel> attValueModelSet = new HashSet<AttributeValueModel>();
	/**
	 * @return the atrributeName
	 */
	public String getAtrributeName()
	{
		return atrributeName;
	}
	/**
	 * @param atrributeName the atrributeName to set
	 */
	public void setAtrributeName(String atrributeName)
	{
		this.atrributeName = atrributeName;
	}
	/**
	 * @return the atrributeType
	 */
	public String getAtrributeType()
	{
		return atrributeType;
	}
	/**
	 * @param atrributeType the atrributeType to set
	 */
	public void setAtrributeType(String atrributeType)
	{
		this.atrributeType = atrributeType;
	}
	/**
	 * @return the productTypeModel
	 */
	public ProductTypeModel getProductTypeModel()
	{
		return productTypeModel;
	}
	/**
	 * @param productTypeModel the productTypeModel to set
	 */
	public void setProductTypeModel(ProductTypeModel productTypeModel)
	{
		this.productTypeModel = productTypeModel;
	}
	/**
	 * @return the attValueModelSet
	 */
	public Set<AttributeValueModel> getAttValueModelSet() {
		return attValueModelSet;
	}
	/**
	 * @param attValueModelSet the attValueModelSet to set
	 */
	public void setAttValueModelSet(Set<AttributeValueModel> attValueModelSet) {
		this.attValueModelSet = attValueModelSet;
	}
	
	
}
