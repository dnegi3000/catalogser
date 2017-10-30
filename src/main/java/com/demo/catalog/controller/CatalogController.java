package com.demo.catalog.controller;

import javax.persistence.EntityExistsException;

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
import com.demo.catalog.service.CategoryService;

@RestController
public class CatalogController {

	private static final Logger log = LoggerFactory.getLogger(CatalogController.class);

	private CatalogService catalogService;

	@Autowired
	public void setCatSet(CatalogService pCatService) {

		this.catalogService = pCatService;
	}

	private CategoryService categoryService;

	@Autowired
	public void setCategoryService(CategoryService pCategoryService) {

		this.categoryService = pCategoryService;
	}

	
	
	@RequestMapping(value = "/createCatalog", method = RequestMethod.POST)
	@CrossOrigin(origins="*",allowedHeaders="*")
    public Catalog handleRequestCreateProuct(@RequestParam(name = "name") String pDisplayName,
										  @RequestParam(name = "description") String pDescription,
										  @RequestParam(name = "longDescription") String pLongDescription,
										  @RequestParam(name = "id" ) String pId ) {
		log.info("Inside /createCatalog");
		log.info("Param value: name -->" + pDisplayName);
		log.info("Param value: description -->" + pDescription);
		log.info("Param value: longDescription -->" + pLongDescription);
		Catalog catalog = catalogService.getCatalog(pId);
		Catalog newCatalog = null; 
		if ( catalog != null )
		{
			throw new EntityExistsException("Entity of type requested with same id already exists");
			
		}else {
		
			newCatalog = new Catalog(pDisplayName, pDescription, pLongDescription,pId);
		return catalogService.createCatalog(newCatalog);
		}
		
		
	}
	
	
	@RequestMapping(value = "/createCategory", method = RequestMethod.POST)
	@CrossOrigin(origins="*",allowedHeaders="*")
	public Category handleRequesrCreateCategories(@RequestParam (name="id") String pId,
											  @RequestParam (name="name") String pName,
											  @RequestParam (name="site") String site,
											  @RequestParam (name="country")String pCountry,
											  @RequestParam (name="longDescription") String pLongDescrition,
											  @RequestParam (name="description") String pDescription) {
		
		log.info("Inside /createCategories");
		
		Category category = categoryService.getCategory(pId);
		Category newCategory = null; 
		if ( category != null )
		{
			throw new EntityExistsException("Entity of type requested with same id already exists");
			
		}else {
		
			newCategory = new Category(pId,pName,site,pCountry, pLongDescrition,pDescription);
		return categoryService.createCategory(newCategory);
		}
		
	}

}


