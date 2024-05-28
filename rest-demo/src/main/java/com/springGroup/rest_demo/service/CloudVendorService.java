package com.springGroup.rest_demo.service;

import java.util.List;

import com.springGroup.rest_demo.model.CloudVendor;

public interface CloudVendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String vendorId);
	public CloudVendor getCloudVendor(String vendorID);
	public List<CloudVendor> getAllCloudVendors();

}
