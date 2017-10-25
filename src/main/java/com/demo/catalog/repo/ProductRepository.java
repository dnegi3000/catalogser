package com.demo.catalog.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.catalog.domain.Product;


public interface ProductRepository extends  CrudRepository<Product,Long> {

}
