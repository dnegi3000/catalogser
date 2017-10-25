package com.demo.catalog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.catalog.domain.Category;
import com.demo.catalog.domain.Product;
import com.demo.catalog.service.ProductService;

@RestController
public class ProductCatalogController {

	private static final Logger log = LoggerFactory.getLogger(ProductCatalogController.class);

	private ProductService catService;

	@Autowired
	public void setCatSet(ProductService pCatService) {

		this.catService = pCatService;
	}

	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)

	public void handleRequestCreateProuct(@RequestParam(name = "prodDisplayName") String pProductDisplayName,
										  @RequestParam(name = "prodDescription") String pProductDescription,
										  @RequestParam(name = "prodLongDescription") String pLongDescription) {
		log.info("Inside /createProduct");
		Product prod = new Product(pProductDisplayName, pProductDescription, pLongDescription);
		catService.createProduct(prod);
	}
	
	
	@RequestMapping(value = "/createCategories", method = RequestMethod.POST)
	public void handleRequesrCreateCategories(
											@RequestParam (name = "catDispalyName") String catDisplayName,
											@RequestParam (name="catDescrtion") String catDescription){
		
		log.info("Inside /createCategories");
		Category cat = new Category();
		
	}

}


