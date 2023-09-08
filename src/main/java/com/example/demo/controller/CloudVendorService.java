package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorService {
	
	CloudVendor cloudvendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		
		return cloudvendor;
		
	}
	
	@PostMapping
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
	
	@PutMapping
	public String updateVendorDetails(@RequestBody CloudVendor cloudvendor) {
		this.cloudvendor = cloudvendor;
		
		return "vendor details updated successfully";
	}
		
	
	
}
