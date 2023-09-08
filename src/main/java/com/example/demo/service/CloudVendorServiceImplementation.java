package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.CloudVendor;
import com.example.demo.repository.CloudVendorRepository;

@Service 
/*
 * mandatory annotation for the Service layer
 */
public class CloudVendorServiceImplementation implements CloudVendorService{

	CloudVendorRepository  cloudVendorepo;
	/*
	 * need this instance since its the intermediate layer
	 * to the actual database
	 */
	
	public CloudVendorServiceImplementation(CloudVendorRepository cloudVendorepo) {
		super();
		this.cloudVendorepo = cloudVendorepo;
	}
	
	
	//overridden methods
	
	@Override
	
	//create and save a vendor to db
	public String createCloudVendor(CloudVendor cloudVendor) {
		
		cloudVendorepo.save(cloudVendor); //saves data to db
		
		return "Successful insertion";
	}

	@Override
	//update vendor details
	public String updateCloudVendor(CloudVendor cloudvendor) {
		
		cloudVendorepo.save(cloudvendor); //saves updated data to db
		
		return "Updated Successfully";
	}

	@Override
	//delete vendor details
	public String deleteCloudVendor(String cloudVendorId) {
		
		cloudVendorepo.deleteById(cloudVendorId); //deletes based on specified parameter
		
		return "Successful deletion";
	}

	@Override
	//get a specific cloud vendor
	public CloudVendor getCloudVendor(String cloudVendorId) {
		
		return cloudVendorepo.findById(cloudVendorId).get(); //retrieves based on parameter
	}

	@Override
	//retrieve all cloud vendors
	public List<CloudVendor> getAllCloudVendor() {
		
		return cloudVendorepo.findAll();//retrieves all
	}

}
