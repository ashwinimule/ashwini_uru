package com.uru.app.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_type")
public class ProductType extends MasterEntity
{
	@Column(name = "prod_type", nullable = false)
	private String prodType;
	
	@Column(name = "prod_type_desc", nullable = true)
	private String prodTypeDesc;
	
	@Column(name = "prod_type_s_img", nullable = true)
	private String prodTypeSmImg;
	
	@Column(name = "prod_type_l_img", nullable = true)
	private String prodTypeLgImg;
	
	@ManyToOne
	@JoinColumn(name = "product_catalog_id", nullable = false)
	private ProductCatalog prodCategory;
	
	@OneToMany(mappedBy="productType", cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Attribute> attributes = new HashSet<Attribute>();
	
	@OneToMany(mappedBy = "productType",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Item> items = new HashSet<Item>();

	/**
	 * @return the prodType
	 */
	public String getProdType()
	{
		return prodType;
	}

	/**
	 * @param prodType the prodType to set
	 */
	public void setProdType(String prodType)
	{
		this.prodType = prodType;
	}

	/**
	 * @return the prodTypeDesc
	 */
	public String getProdTypeDesc()
	{
		return prodTypeDesc;
	}

	/**
	 * @param prodTypeDesc the prodTypeDesc to set
	 */
	public void setProdTypeDesc(String prodTypeDesc)
	{
		this.prodTypeDesc = prodTypeDesc;
	}

	/**
	 * @return the prodTypeSmImg
	 */
	public String getProdTypeSmImg()
	{
		return prodTypeSmImg;
	}

	/**
	 * @param prodTypeSmImg the prodTypeSmImg to set
	 */
	public void setProdTypeSmImg(String prodTypeSmImg)
	{
		this.prodTypeSmImg = prodTypeSmImg;
	}

	/**
	 * @return the prodTypeLgImg
	 */
	public String getProdTypeLgImg()
	{
		return prodTypeLgImg;
	}

	/**
	 * @param prodTypeLgImg the prodTypeLgImg to set
	 */
	public void setProdTypeLgImg(String prodTypeLgImg)
	{
		this.prodTypeLgImg = prodTypeLgImg;
	}

	/**
	 * @return the prodCategory
	 */
	public ProductCatalog getProdCategory()
	{
		return prodCategory;
	}

	/**
	 * @param prodCategory the prodCategory to set
	 */
	public void setProdCategory(ProductCatalog prodCategory)
	{
		this.prodCategory = prodCategory;
	}

	/**
	 * @return the attributes
	 */
	public Set<Attribute> getAttributes()
	{
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Set<Attribute> attributes)
	{
		this.attributes = attributes;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}


}
