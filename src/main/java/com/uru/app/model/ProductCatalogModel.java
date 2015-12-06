package com.uru.app.model;

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

public class ProductCatalogModel {
	
	private Long id;

	private String catName;
	private String catDescription;

	@JsonBackReference
	private ProductCatalogModel parentCategory;

	@JsonManagedReference
	private Set<ProductCatalogModel> subCategories = new HashSet<ProductCatalogModel>();

	@JsonManagedReference
	private Set<ProductTypeModel> productTypes = new HashSet<ProductTypeModel>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the catName
	 */
	public String getCatName() {
		return catName;
	}

	/**
	 * @param catName
	 *            the catName to set
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}

	/**
	 * @return the catDescription
	 */
	public String getCatDescription() {
		return catDescription;
	}

	/**
	 * @param catDescription
	 *            the catDescription to set
	 */
	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}

	/**
	 * @return the parentCategory
	 */
	public ProductCatalogModel getParentCategory() {
		return parentCategory;
	}

	/**
	 * @param parentCategory
	 *            the parentCategory to set
	 */
	public void setParentCategory(ProductCatalogModel parentCategory) {
		this.parentCategory = parentCategory;
	}

	/**
	 * @return the subCategories
	 */
	public Set<ProductCatalogModel> getSubCategories() {
		return subCategories;
	}

	/**
	 * @param subCategories
	 *            the subCategories to set
	 */
	public void setSubCategories(Set<ProductCatalogModel> subCategories) {
		this.subCategories = subCategories;
	}

	public Set<ProductTypeModel> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(Set<ProductTypeModel> productTypes) {
		this.productTypes = productTypes;
	}

}
