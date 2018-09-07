package com.demo.catalog.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.catalog.domain.SKU;


public interface SKURepository extends  MongoRepository<SKU,String > {

}
