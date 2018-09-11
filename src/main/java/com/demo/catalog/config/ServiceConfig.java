/**
 * 
 */
package com.demo.catalog.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author deenegi0
 *
 */
@Component
public class ServiceConfig {
	
	@Value("${key.test}")
	private String name;
	
    String getName() {
		return name;
    }
	 
}
