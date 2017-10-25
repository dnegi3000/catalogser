package com.demo.catalog.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.catalog.domain.Brand;


public interface BrandRepository extends  CrudRepository<Brand,Long> {

}
