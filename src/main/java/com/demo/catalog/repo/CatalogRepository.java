package com.demo.catalog.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.catalog.domain.Catalog;


public interface CatalogRepository extends  DefaultCrudRepository<Catalog,String> {

}
