package com.demo.catalog.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.catalog.domain.Category;


public interface CategoryRepository extends  MongoRepository<Category,String> {

}
