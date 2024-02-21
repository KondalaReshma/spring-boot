package com.spring.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.BusinessProfile;

import com.spring.project.repository.BusinessProfileRepo;
import com.spring.project.service.BusinessProfileService;


@Service
public class BusinessProfilesServiceimpl implements BusinessProfileService {

	@Autowired
	private BusinessProfileRepo businessprofilerepo;
	@Override
	public List<BusinessProfile> getAllbusinessprofiles() {
		// TODO Auto-generated method stub
		
		List<BusinessProfile> businessprofile  = businessprofilerepo.findAll();
		return businessprofile;
	}
	@Override
	public BusinessProfile addbusinessprofile(BusinessProfile businessprofile) {
		// TODO Auto-generated method stub
		return businessprofilerepo.save(businessprofile);
	}

}
