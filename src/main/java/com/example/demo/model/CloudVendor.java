package com.example.demo.model;

public class CloudVendor {
	
	//data members
	private String vendorId;
	private String vendorName;
	private String vendorAdress;
	private String vendorPhonenumber;
	
	//constructors
	public CloudVendor() {
		super();
	}
	
	public CloudVendor(String vendorId, String vendorName, String vendorAdress, String vendorPhonenumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAdress = vendorAdress;
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

	public String getVendorAdress() {
		return vendorAdress;
	}

	public void setVendorAdress(String vendorAdress) {
		this.vendorAdress = vendorAdress;
	}

	public String getVendorPhonenumber() {
		return vendorPhonenumber;
	}

	public void setVendorPhonenumber(String vendorPhonenumber) {
		this.vendorPhonenumber = vendorPhonenumber;
	}
	
	

}
