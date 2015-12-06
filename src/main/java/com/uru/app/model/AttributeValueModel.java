package com.uru.app.model;

import org.codehaus.jackson.annotate.JsonBackReference;


public class AttributeValueModel extends MasterModel{

	@JsonBackReference
	private ItemModel item;
	private String attValue;
	
	
	private AttributeModel attribute;
	/**
	 * @return the item
	 */
	public ItemModel getItem()
	{
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(ItemModel item)
	{
		this.item = item;
	}
	/**
	 * @return the attValue
	 */
	public String getAttValue()
	{
		return attValue;
	}
	/**
	 * @param attValue the attValue to set
	 */
	public void setAttValue(String attValue)
	{
		this.attValue = attValue;
	}
	/**
	 * @return the attribute
	 */
	public AttributeModel getAttribute()
	{
		return attribute;
	}
	/**
	 * @param attribute the attribute to set
	 */
	public void setAttribute(AttributeModel attribute)
	{
		this.attribute = attribute;
	}


}
