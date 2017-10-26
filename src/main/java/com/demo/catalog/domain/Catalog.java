package com.demo.catalog.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	
	public Catalog(){
		
	}
	public Catalog(String name, String description,String longDescription,String pId){
		this.name = name ;
		this.description = description;
		this.longDescription = longDescription;
		this.id = pId;
					
	}
	
	
	/**
	 * Setter
	 */
	
	private String name;

	/**
	 * Setter for name
	 * 
	 * @param pName
	 */
	public void setName(String pName) {
		name = pName;
	}

	/**
	 * Getter
	 * 
	 * @return name String
	 */
	public String getName() {
		return name;
	}

	private String siteID;

	/**
	 * Getter For siteID
	 * 
	 * @return the siteID
	 */
	public String getSiteID() {
		return siteID;
	}

	/**
	 * Getter For childCatalogs
	 * 
	 * @return the childCatalogs
	 */
	public List<Catalog> getChildCatalogs() {
		return childCatalogs;
	}

	/**
	 * Getter For parentCatalog
	 * 
	 * @return the parentCatalog
	 */
	public Catalog getParentCatalog() {
		return parentCatalog;
	}

	/**
	 * Getter For masterCatalog
	 * 
	 * @return the masterCatalog
	 */
	public Boolean getMasterCatalog() {
		return masterCatalog;
	}

	/**
	 * Getter For childCatagories
	 * 
	 * @return the childCatagories
	 */
	public Category getChildCatagories() {
		return childCatagories;
	}

	/**
	 * Setter for the siteID
	 * 
	 * @param siteID
	 *            the siteID to set
	 */
	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	/**
	 * Setter for the childCatalogs
	 * 
	 * @param childCatalogs
	 *            the childCatalogs to set
	 */
	public void setChildCatalogs(List<Catalog> childCatalogs) {
		this.childCatalogs = childCatalogs;
	}

	/**
	 * Setter for the parentCatalog
	 * 
	 * @param parentCatalog
	 *            the parentCatalog to set
	 */
	public void setParentCatalog(Catalog parentCatalog) {
		this.parentCatalog = parentCatalog;
	}

	/**
	 * Setter for the masterCatalog
	 * 
	 * @param masterCatalog
	 *            the masterCatalog to set
	 */
	public void setMasterCatalog(Boolean masterCatalog) {
		this.masterCatalog = masterCatalog;
	}

	/**
	 * Setter for the childCatagories
	 * 
	 * @param childCatagories
	 *            the childCatagories to set
	 */
	public void setChildCatagories(Category childCatagories) {
		this.childCatagories = childCatagories;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	private List<Catalog> childCatalogs;

	private Catalog parentCatalog;

	private Boolean masterCatalog;

	private Category childCatagories;
	
	private String description;
	
	private String longDescription;
	
	public String getDescription() {
		return description;
	}

	


	

}
