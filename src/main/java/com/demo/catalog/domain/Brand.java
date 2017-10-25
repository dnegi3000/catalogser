/**
 * 
 */
package com.demo.catalog.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author dnegi3
 *
 */
@Document
public class Brand implements Serializable{
	
	/**
	 * Generated Serial Number
	 */
	private static final long serialVersionUID = -7749195570984905002L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	/**
	 * Getter For id
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * Setter for the  id
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	
	private String brandName;


	/**
	 * Getter For brandName
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}


	/**
	 * Setter for the  brandName
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

    
}
