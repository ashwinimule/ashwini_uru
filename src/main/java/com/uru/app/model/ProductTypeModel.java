package com.uru.app.model;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

public class ProductTypeModel extends MasterModel {

	private String prodType;

	private String prodTypeDesc;

	private String prodTypeSmImg;

	private String prodTypeLgImg;
	
	@JsonBackReference
	private ProductCatalogModel prodCategory;

	@JsonManagedReference
	private Set<AttributeModel> attributes = new HashSet<AttributeModel>();

	@JsonManagedReference
	private Set<ItemModel> items = new HashSet<ItemModel>();

	/**
	 * @return the prodType
	 */
	public String getProdType() {
		return prodType;
	}

	/**
	 * @param prodType
	 *            the prodType to set
	 */
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	/**
	 * @return the prodTypeDesc
	 */
	public String getProdTypeDesc() {
		return prodTypeDesc;
	}

	/**
	 * @param prodTypeDesc
	 *            the prodTypeDesc to set
	 */
	public void setProdTypeDesc(String prodTypeDesc) {
		this.prodTypeDesc = prodTypeDesc;
	}

	/**
	 * @return the prodTypeSmImg
	 */
	public String getProdTypeSmImg() {
		return prodTypeSmImg;
	}

	/**
	 * @param prodTypeSmImg
	 *            the prodTypeSmImg to set
	 */
	public void setProdTypeSmImg(String prodTypeSmImg) {
		this.prodTypeSmImg = prodTypeSmImg;
	}

	/**
	 * @return the prodTypeLgImg
	 */
	public String getProdTypeLgImg() {
		return prodTypeLgImg;
	}

	/**
	 * @param prodTypeLgImg
	 *            the prodTypeLgImg to set
	 */
	public void setProdTypeLgImg(String prodTypeLgImg) {
		this.prodTypeLgImg = prodTypeLgImg;
	}

	/**
	 * @return the prodCategory
	 */
	public ProductCatalogModel getProdCategory() {
		return prodCategory;
	}

	/**
	 * @param prodCategory
	 *            the prodCategory to set
	 */
	public void setProdCategory(ProductCatalogModel prodCategory) {
		this.prodCategory = prodCategory;
	}

	/**
	 * @return the attributes
	 */
	public Set<AttributeModel> getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes
	 *            the attributes to set
	 */
	public void setAttributes(Set<AttributeModel> attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the items
	 */
	public Set<ItemModel> getItems()
	{
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set<ItemModel> items)
	{
		this.items = items;
	}


}
