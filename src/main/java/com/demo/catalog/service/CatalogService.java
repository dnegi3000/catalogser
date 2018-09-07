package com.demo.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.demo.catalog.domain.Catalog;
import com.demo.catalog.repo.CatalogRepository;

@Service
public class CatalogService {

	@Autowired
	private CatalogRepository catalogRepository;
	
	public CatalogService(CatalogRepository pProdRepository){
		catalogRepository = pProdRepository;
	}
	
	/**
	 * 
	 * @return
	 */
     public Catalog  getCatalog(String prodId){
    	 
    	return  catalogRepository.findById(prodId).orElse(null);
    	 
     }
	
     public Catalog   createCatalog(Catalog catalog){
    	 
     return catalogRepository.save(catalog);
     }	
     
    
}
