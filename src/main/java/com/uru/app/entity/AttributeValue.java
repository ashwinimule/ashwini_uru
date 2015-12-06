package com.uru.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "attribute_value")
public class AttributeValue extends MasterEntity
{
	@ManyToOne
	@JoinColumn(name = "item_id", nullable = false)
	private Item item;
	
	@Column(name = "att_value", nullable = false)
	private String attValue;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="att_id")
	private Attribute attribute;

	/**
	 * @return the item
	 */
	public Item getItem()
	{
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item)
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

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

}
