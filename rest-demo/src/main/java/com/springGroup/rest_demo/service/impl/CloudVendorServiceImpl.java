package com.springGroup.rest_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springGroup.rest_demo.model.CloudVendor;
import com.springGroup.rest_demo.repository.CloudVendorRepository;
import com.springGroup.rest_demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl  implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String vendorId) {
		cloudVendorRepository.deleteById(vendorId);
		return "Success";
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepository.findAll();
	}

	@Override
	public CloudVendor getCloudVendor(String vendorID) {
		return cloudVendorRepository.findById(vendorID).get();
	}
	
	

	

}
