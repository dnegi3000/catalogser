package com.demo.catalog.domain;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Product implements Serializable {

	/**
	 * auto generated uid
	 */
   private static final long serialVersionUID = 2930079164473890452L;
   
   private static final Logger log = LoggerFactory.getLogger(Product.class);
	
	@Id
	private String id; 
	

	
	/**
	 * 
	 */
	public Product(){
		log.info("Default construction for Prducts");; 	
	}

    public Product(String pDisplayName,String pDescription,String pLongDescrtiption){
	   	this.setDisplayName(pDisplayName);
		this.setDescription(pDescription);
		this.longDiscription=pLongDescrtiption;
	 }

    public Product(String  pId, String pDisplayName,String pDescription,String pLongDescrtiption){
	    this.id=pId;
    	this.setDisplayName(pDisplayName);
		this.setDescription(pDescription);
		this.longDiscription=pLongDescrtiption;
	 }

    private String displayName;
	
    /**
	 * Getter For displayName
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Setter for the  displayName
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	
	private String description;
	
	/**
	 * Getter For description
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter for the  description
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	private String longDiscription;

	/**
	 * Getter For longDiscription
	 * 
	 * @return the longDiscription
	 */
	public String getLongDiscription() {
		return longDiscription;
	}

	/**
	 * Setter for the longDiscription
	 * 
	 * @param longDiscription
	 *            the longDiscription to set
	 */
	public void setLongDiscription(String longDiscription) {
		this.longDiscription = longDiscription;
	}
	
	/**
	 * Getter For skuList
	 * @return the skuList
	 */
	public List<SKU> getSkuList() {
		return skuList;
	}

	/**
	 * Setter for the  skuList
	 * @param skuList the skuList to set
	 */
	public void setSkuList(List<SKU> skuList) {
		this.skuList = skuList;
	}

	private List<SKU>  skuList;
	
	private Category parentCategory;
 	
	/**
	 * Getter For parentCategory
	 * @return the parentCategory
	 */
	public Category getParentCategory() {
		return parentCategory;
	}
	
	public void setParentCategory(Category parentCategory) {
		
		this.parentCategory = parentCategory;
	}

	/**
	 * Getter For brand
	 * @return the brand
	 */
	public Brand getBrand() {
		return brand;
	}

	/**
	 * Setter for the  brand
	 * @param brand the brand to set
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	
	private Brand brand;
	
	



}
