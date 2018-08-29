/**
 * 
 */
package com.demo.catalog.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
/**
 * @author deenegi0
 *
 */
public interface DefaultCrudRepository<T,ID> extends CrudRepository<T, ID>{
	

default T findOneById(ID id) {
	
	return findById(id).orElse(null);
	
}	
}
