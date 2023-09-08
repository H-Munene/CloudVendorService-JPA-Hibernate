package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;
import com.example.demo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	
	
	//get specific cloud vendor
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		/*
		 * defines how resources or data should be retrieved from your application
		 * 
		 * @Pathvariable takes the 'vendorId' value from the URL to this method 
		 * which will be used by the getCloudVendor in the Service Layer
		 */
		return cloudVendorService.getCloudVendor(vendorId);
		
	}
	
	//retrieve all cloud vendors from db
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		
		/*
		 * defines how resources or data should be retrieved from your application
		 * 
		 * @Pathvariable takes the 'vendorId' value from the URL to this method 
		 * which will be used by the getCloudVendor in the Service Layer
		 */
		return cloudVendorService.getAllCloudVendor();
		
	}
	
	@PostMapping //create and save a vendor
	public String createVendorDetails(@RequestBody CloudVendor cloudvendor) {
		
		cloudVendorService.createCloudVendor(cloudvendor);
		
		return "Vendor created successfully";
		
		/*@PostMapping: used to map HTTP POST requests to a specific method in a controller class. 
		 * In this case, the method createVendorDetails will be invoked 
		 * when a POST request is made to the end-point that this method is mapped to.
		 * 
		 * @RequestBody: This annotation is used to indicate that the cloudvendor parameter 
		 * should be populated with the JSON data from the request body. In other words, 
		 * it tells Spring to deserialize the incoming JSON data into a CloudVendor object 
		 * and pass it as an argument to this method.
		 */
	}
	
	@PutMapping //update vendor details
	public String updateVendorDetails(@RequestBody CloudVendor cloudvendor) {
		cloudVendorService.updateCloudVendor(cloudvendor);
		/*
		 *@PutMapping specifies that this method should handle PUT requests 
		 * for a particular URL pattern.You typically provide the URL pattern as a parameter 
		 * to the annotation.
		 * 
		 * It allows you to define how resources should be updated or replaced in your application
		 */
		
		return "Vendor details updated successfully";
	}
	
	@DeleteMapping("{vendorId}")  //delete
	public String deleteVendorDetails(@PathVariable("vendorId") String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		
		/*@DeleteMapping specifies that this method should handle DELETE requests 
		 * for a particular URL pattern.You typically provide the URL pattern as a parameter 
		 * to the annotation.
		 * 
		 * @Pathvariable takes the 'vendorId' value from the URL to this method 
		 * which will be used by the createCloudVendor in the Service Layer
		 */
		 
		return "Vendor deleted successfully";
	}
		
	
	
}
