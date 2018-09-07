package com.demo.catalog.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.catalog.domain.Product;


public interface ProductRepository extends  MongoRepository<Product,String> {

}
