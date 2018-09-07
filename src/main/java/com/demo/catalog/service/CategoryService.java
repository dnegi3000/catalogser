package com.demo.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.catalog.domain.Category;
import com.demo.catalog.repo.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository catRepsitory){
		categoryRepository = catRepsitory;
	}
	
	/**
	 * 
	 * @return
	 */
     public Category  getCategory(String categoryId){
    	 
    	return  categoryRepository.findById(categoryId).orElse(null);
    	 
     }
	
     public Category   createCategory(Category category){
    	 
     return categoryRepository.save(category);
     }	
}
