package com.springGroup.rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springGroup.rest_demo.model.CloudVendor;

public interface CloudVendorRepository  extends JpaRepository<CloudVendor, String>{

}
