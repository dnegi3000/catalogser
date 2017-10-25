package com.demo.catalog.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="sku")
public class SKU implements Serializable{

	/**
	 * Generated serial number 
	 */
	private static final long serialVersionUID = -965304802989090323L;
	@Id
	private String skuId;

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	
	private String  dispalyName;

	public String getDispalyName() {
		return dispalyName;
	}

	public void setDispalyName(String dispalyName) {
		this.dispalyName = dispalyName;
	}
	
	
	
	
	
	
}
