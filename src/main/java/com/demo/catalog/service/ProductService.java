package com.demo.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.catalog.domain.Product;
import com.demo.catalog.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepository;
	
	public ProductService(ProductRepository pProdRepository){
		prodRepository = pProdRepository;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
     public Product  getProduct(Long prodId){
    	 
    	return  prodRepository.findOneById(prodId);
    	 
     }
	
     public Product   createProduct(Product prod){
    	 
     return prodRepository.save(prod);
     }	
}
