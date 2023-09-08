package com.example.demo.service;

import java.util.List;

import com.example.demo.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor) ; //create and add vendor to repo
	public String updateCloudVendor(CloudVendor cloudvendor) ; // update cloud vendor details
	public String deleteCloudVendor(String cloudVendorId); //delete a cloud vendor
	public CloudVendor getCloudVendor(String cloudVendorId); //get one cloud vendor
	public List<CloudVendor> getAllCloudVendor(); //get all vendors in repo
	
}