package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
	
	/*<CloudVendor,
	 * The first type parameter (CloudVendor) specifies the entity type 
	 * associated with this repository. In this case, it indicates that this repository 
	 * is used to manage instances of the CloudVendor entity.
	 * 
	 * ,String>
	   The second type parameter (String) specifies the type of the primary key 
	   for the CloudVendor entity;it specifies the data type of the unique identifier 
	   used to distinguish one CloudVendor entity from another. In this case, it's a String primary key.
	 */
	
	

}
