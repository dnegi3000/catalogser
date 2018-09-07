package com.demo.catalog.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.catalog.domain.Brand;


public interface BrandRepository extends  MongoRepository<Brand,String> {

}
