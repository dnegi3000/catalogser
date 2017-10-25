package com.demo.catalog.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.catalog.domain.SKU;


public interface SKURepository extends  CrudRepository<SKU,Long> {

}
