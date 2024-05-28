package com.springGroup.rest_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {

	@Id
	private String  vendorId;
	private String  vendoerName;
	private String  vendorAddress;
	private String  vendorPhoneNumber;
	
	
	
	public CloudVendor() {
		
	}



	public CloudVendor(String vendorId, String vendoerName, String vendorAddress, String vendorPhoneNumber) {
		
		this.vendorId = vendorId;
		this.vendoerName = vendoerName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}



	public String getVendorId() {
		return vendorId;
	}



	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}



	public String getVendoerName() {
		return vendoerName;
	}



	public void setVendoerName(String vendoerName) {
		this.vendoerName = vendoerName;
	}



	public String getVendorAddress() {
		return vendorAddress;
	}



	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}



	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}



	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	
	
}
