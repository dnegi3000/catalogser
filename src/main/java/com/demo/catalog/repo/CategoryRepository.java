package com.demo.catalog.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.catalog.domain.Category;


public interface CategoryRepository extends  CrudRepository<Category,String> {

}
