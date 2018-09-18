/**
 * 
 */
package com.demo.catalog.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author dnegi3
 *
 */

@Document 
public class Category   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -665460085437812305L;
	
	
	public Category(String pId,String pName, String pLongDescrition,String pDescription){
		this.id=pId;
		this.name= pName;
		this.longDescrtion = pLongDescrition;
		this.description = pDescription;
		
	}

	@Id
	private String id;

	
	private String name;
	
	/**
	 * Getter For id
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Getter For name
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	private List<String> site;
	/**
	 * Getter For site
	 * @return the site
	 */
	public List<String> getSite() {
		return site;
	}

	/**
	 * Getter For country
	 * @return the country
	 */
	public List<String> getCountry() {
		return country;
	}
	
	private String longDescrtion;
	
	/**
	 * Setter for the  longDescrtion
	 * @param longDescrtion the longDescrtion to set
	 */
	public void setLongDescrtion(String longDescrtion) {
		this.longDescrtion = longDescrtion;
	}
	
	/**
	 * Getter For longDescrtion
	 * @return the longDescrtion
	 */
	public String getLongDescrtion() {
		return longDescrtion;
	}

	/**
	 * Setter for the  id
	 * @param id the id to set
	 */
	public void setId(String id) {
		id = id;
	}

	/**
	 * Setter for the  name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for the  site
	 * @param site the site to set
	 */
	public void setSite(List<String> site) {
		this.site = site;
	}
	
	private List<String> country;
	
	/**
	 * Setter for the  country
	 * @param country the country to set
	 */
	public void setCountry(List<String> country) {
		this.country = country;
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
	 * @param descrtiption the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	private String catalog;
	
	/**
	 * Getter For catalog
	 * @return the catalog
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * Setter for the  catalog
	 * @param catalog the catalog to set
	 */
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	
	/**
	 * 
	 */
	private Map media;

	/**
	 * Getter For media
	 * @return the media
	 */
	public Map getMedia() {
		return media;
	}

	/**
	 * Setter for the  media
	 * @param media the media to set
	 */
	public void setMedia(Map media) {
		this.media = media;
	}

	
	
	
	
}
