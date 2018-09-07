package com.demo.catalog.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.catalog.domain.Catalog;


public interface CatalogRepository extends MongoRepository<Catalog,String> {

}
