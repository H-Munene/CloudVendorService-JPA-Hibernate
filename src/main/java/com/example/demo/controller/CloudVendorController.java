package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendor cloudvendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		
		/*
		 * defines how resources or data should be retrieved from your application
		 */
		
		return cloudvendor;
		
	}
	
	@PostMapping //create
	public String createVendorDetails(@RequestBody CloudVendor cloudvendor) {
		
		this.cloudvendor = cloudvendor;
		
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
	
	@PutMapping //update
	public String updateVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor = cloudvendor;
		
		/*
		 *@PutMapping specifies that this method should handle PUT requests 
		 * for a particular URL pattern.You typically provide the URL pattern as a parameter 
		 * to the annotation.
		 * 
		 * It allows you to define how resources should be updated or replaced in your application
		 */
		
		return "vendor details updated successfully";
	}
	
	@DeleteMapping("{vendorId}")  //delete
	public String createVendorDetails(String vendorId) {
		this.cloudvendor = null;
		
		/*@DeleteMapping specifies that this method should handle DELETE requests 
		 * for a particular URL pattern.You typically provide the URL pattern as a parameter 
		 * to the annotation.
		 *
		 * This has the effect of clearing or resetting the value of cloudvendor 
		 * to indicate that there is no longer any associated data or object reference 
		 * stored in this variable. It might be used, for example, 
		 * to indicate that the "vendor" information has been deleted 
		 * or that there is no active vendor information in the current state of the class.
		 */
		
		return "Vendor deleted successfully";
	}
		
	
	
}
