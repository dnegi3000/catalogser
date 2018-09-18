package com.demo.catalog.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Catalog implements Serializable {

	/**
	 * auto generated uid
	 */
	private static final long serialVersionUID = 2930079164473890452L;

	
	// @SequenceGenerator (name="catalogSeq",initialValue
	// =10000,sequenceName="catalogSeq",allocationSize=100)
	// @GenericGenerator(name = "catalog_sequence_id", strategy =
	// "com.demo.catalog.id.custom.CustomIDGenerator")
	// @GeneratedValue(generator = "catalog_sequence_id")
	@Id
	private String id;

	/**
	 * Getter
	 * 
	 * @return CatId
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param catID
	 */
	public void setId(String catID) {
		this.id = catID;
	}
	
	private String description;
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Catalog(){
		
	}

	/**
	 * @param pDisplayName
	 * @param pId
	 */
	public Catalog(String pDisplayName, String pId) {
	 this.setId(pId);
	 this.setDescription(pId);
	}
	
    
	

}
