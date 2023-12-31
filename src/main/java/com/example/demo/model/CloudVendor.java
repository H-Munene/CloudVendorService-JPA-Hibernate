package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "cloud_vendor_info") 
/*
 * @Table
 * creates table with name specified in bracket.
 * else cloud_vendor will be formed instead
 * by default
 */
public class CloudVendor {
	
	//data members
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhonenumber;
	
	//constructors
	public CloudVendor() {
		super();
	}
	
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhonenumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhonenumber = vendorPhonenumber;
	}

	//getter - setters 
	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAdress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhonenumber() {
		return vendorPhonenumber;
	}

	public void setVendorPhonenumber(String vendorPhonenumber) {
		this.vendorPhonenumber = vendorPhonenumber;
	}
	
	

}
