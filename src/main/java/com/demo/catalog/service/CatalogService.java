package com.demo.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
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
    	 
    	return  catalogRepository.findOneById(prodId);
    	 
     }
	
     public Catalog   createCatalog(Catalog catalog){
    	 
     return catalogRepository.save(catalog);
     }	
     
    
}
