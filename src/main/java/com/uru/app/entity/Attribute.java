package com.uru.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "attributes")
public class Attribute extends MasterEntity
{
	@Column(name = "att_name", nullable = false)
	private String atrributeName;
	
	@Column(name = "att_Type", nullable = false)
	private String atrributeType;
	
	@ManyToOne
	@JoinColumn(name = "product_type_id", nullable = false)
	private ProductType productType;
	
	@OneToMany(mappedBy="attribute", cascade=CascadeType.ALL)
	private Set<AttributeValue> attValueSet = new HashSet<AttributeValue>();

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

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	/**
	 * @return the attValueSet
	 */
	public Set<AttributeValue> getAttValueSet() {
		return attValueSet;
	}

	/**
	 * @param attValueSet the attValueSet to set
	 */
	public void setAttValueSet(Set<AttributeValue> attValueSet) {
		this.attValueSet = attValueSet;
	}


}
