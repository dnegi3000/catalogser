package com.demo.catalog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.catalog.domain.Catalog;
import com.demo.catalog.domain.Category;
import com.demo.catalog.service.CatalogService;

@RestController
public class CatalogController {

	private static final Logger log = LoggerFactory.getLogger(CatalogController.class);

	private CatalogService catalogService;

	@Autowired
	public void setCatSet(CatalogService pCatService) {

		this.catalogService = pCatService;
	}

	
	
	
	@RequestMapping(value = "/createCatalog", method = RequestMethod.POST)
	@CrossOrigin(origins="*",allowedHeaders="*")
    public void handleRequestCreateProuct(@RequestParam(name = "name") String pDisplayName,
										  @RequestParam(name = "description") String pDescription,
										  @RequestParam(name = "longDescription") String pLongDescription) {
		log.info("Inside /createCatalog");
		log.info("Param value: name -->" + pDisplayName);
		log.info("Param value: description -->" + pDescription);
		log.info("Param value: longDescription -->" + pLongDescription);
		catalogService.getCatalog("id");
		
		Catalog catalog = new Catalog(pDisplayName, pDescription, pLongDescription);
		catalogService.createCatalog(catalog);
	}
	
	
	//@RequestMapping(value = "/createCategories", method = RequestMethod.POST)
	public void handleRequesrCreateCategories(
											@RequestParam (name = "catDispalyName") String catDisplayName,
											@RequestParam (name="catDescrtion") String catDescription){
		
		log.info("Inside /createCategories");
		Category cat = new Category();
		
	}

}


