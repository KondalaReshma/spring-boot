package com.spring.project.service;

import java.util.List;

import com.spring.project.entity.BusinessProfile;
import com.spring.project.entity.UserProfiles;



public interface BusinessProfileService {
	
	
	public  BusinessProfile addbusinessprofile(BusinessProfile businessprofile);
	
	public List<BusinessProfile> getAllbusinessprofiles();

}
