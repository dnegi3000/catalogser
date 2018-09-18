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
import com.demo.catalog.domain.Product;
import com.demo.catalog.service.CatalogService;
import com.demo.catalog.service.CategoryService;
import com.demo.catalog.service.ProductService;
import com.mongodb.MongoException;

@RestController
@RequestMapping(value="/pim/")
public class ProductInfoManagementController {

	private static final Logger log = LoggerFactory.getLogger(ProductInfoManagementController.class);

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

	private ProductService catService;

	@Autowired
	public void setCatSet(ProductService pCatService) {

		this.catService = pCatService;
	}
	
	/**
	 * Create Product 
	 * 
	 * 
	 * @param pProductDisplayName
	 * @param pProductDescription
	 * @param pLongDescription
	 */
	
	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)

	public void createProuct(@RequestParam(name = "prodDisplayName") String pProductDisplayName,
							 @RequestParam(name = "prodDescription") String pProductDescription,
							 @RequestParam(name = "prodLongDescription") String pLongDescription
							 ) {
		log.info("Inside createProduct");
		Product prod = new Product(pProductDisplayName, pProductDescription, pLongDescription);
		catService.createProduct(prod);
	}
	
	/**
	 * 
	 * @param pDisplayName
	 * @param pDescription
	 * @param pLongDescription
	 * @param pId
	 * @return
	 */
	@RequestMapping(value = "/createCatalog", method = RequestMethod.POST)
	@CrossOrigin(origins="*",allowedHeaders="*")
    public Catalog createCatalog(@RequestParam(name = "name") String pDisplayName,
										  @RequestParam(name = "description") String pDescription,
										  @RequestParam(name = "longDescription") String pLongDescription,
										  @RequestParam(name = "id" ) String pId ){
		log.info("Inside /createCatalog");
		log.info("Param value: name -->" + pDisplayName);
		log.info("Param value: description -->" + pDescription);
		log.info("Param value: longDescription -->" + pLongDescription);
		Catalog catalog = catalogService.getCatalog(pId);
		Catalog newCatalog = null; 
		if ( catalog != null )
		{
			throw new MongoException("Entity of type requested with same id already exists");
			
		}else {
		
			newCatalog = new Catalog(pDisplayName,pId);
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
			throw new MongoException("Entity of type requested with same id already exists");
			
		}else {
		
			newCategory = new Category(pId,pName, pLongDescrition,pDescription);
		return categoryService.createCategory(newCategory);
		}
		
	}
	
}


