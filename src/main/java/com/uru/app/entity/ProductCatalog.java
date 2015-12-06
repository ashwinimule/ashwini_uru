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
	@NamedQuery(name = "findAllCategories", query = " FROM ProductCatalog prodCatalog where parentCategory=null"),
	@NamedQuery(name = "findCategoryById", query = " Select prodCatalog FROM ProductCatalog prodCatalog where id=:id") })
@Table(name = "product_catalog")
public class ProductCatalog extends MasterEntity
{
	@Column(name = "category_name", nullable = false)
	private String catName;
	@Column(name = "category_desc", nullable = false)
	private String catDescription;
	
	@ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name="parent_id",insertable=false,updatable=false)
	private ProductCatalog parentCategory;
	
	@OneToMany(cascade={CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "parent_id")
	private Set<ProductCatalog> subCategories = new HashSet<ProductCatalog>();
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "prodCategory")
	private Set<ProductType> productTypes = new HashSet<ProductType>();

	/**
	 * @return the catName
	 */
	public String getCatName()
	{
		return catName;
	}

	/**
	 * @param catName the catName to set
	 */
	public void setCatName(String catName)
	{
		this.catName = catName;
	}

	/**
	 * @return the catDescription
	 */
	public String getCatDescription()
	{
		return catDescription;
	}

	/**
	 * @param catDescription the catDescription to set
	 */
	public void setCatDescription(String catDescription)
	{
		this.catDescription = catDescription;
	}

	/**
	 * @return the parentCategory
	 */
	public ProductCatalog getParentCategory()
	{
		return parentCategory;
	}

	/**
	 * @param parentCategory the parentCategory to set
	 */
	public void setParentCategory(ProductCatalog parentCategory)
	{
		this.parentCategory = parentCategory;
	}

	/**
	 * @return the subCategories
	 */
	public Set<ProductCatalog> getSubCategories()
	{
		return subCategories;
	}

	/**
	 * @param subCategories the subCategories to set
	 */
	public void setSubCategories(Set<ProductCatalog> subCategories)
	{
		this.subCategories = subCategories;
	}

	public Set<ProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(Set<ProductType> productTypes) {
		this.productTypes = productTypes;
	}

	

}
