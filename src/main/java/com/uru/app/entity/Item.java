package com.uru.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllItems", query = " FROM Item item"),
		@NamedQuery(name = "findItemById", query = " Select item FROM Item item where id=:id") })
@Table(name = "items")
public class Item extends MasterEntity {
	@Column(name = "item_name", nullable = false)
	private String itemName;
	@Column(name = "item_desc", nullable = true)
	private String itemDescription;
	@Column(name = "item_small_image", nullable = true)
	private String smallImg;
	@Column(name = "item_large_image", nullable = true)
	private String largeImg;

	@ManyToOne
	@JoinColumn(name = "product_type_id", nullable = false)
	private ProductType productType;

	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AttributeValue> attributeValues = new HashSet<AttributeValue>();

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * @param itemDescription
	 *            the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	/**
	 * @return the smallImg
	 */
	public String getSmallImg() {
		return smallImg;
	}

	/**
	 * @param smallImg
	 *            the smallImg to set
	 */
	public void setSmallImg(String smallImg) {
		this.smallImg = smallImg;
	}

	/**
	 * @return the largeImg
	 */
	public String getLargeImg() {
		return largeImg;
	}

	/**
	 * @param largeImg
	 *            the largeImg to set
	 */
	public void setLargeImg(String largeImg) {
		this.largeImg = largeImg;
	}

	/**
	 * @return the attributeValues
	 */
	public Set<AttributeValue> getAttributeValues() {
		return attributeValues;
	}

	/**
	 * @param attributeValues
	 *            the attributeValues to set
	 */
	public void setAttributeValues(Set<AttributeValue> attributeValues) {
		this.attributeValues = attributeValues;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}


}
