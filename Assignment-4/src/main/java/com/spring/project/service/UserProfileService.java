package com.spring.project.service;

import java.util.List;

import com.spring.project.entity.UserProfiles;



public interface UserProfileService {
	
	public  UserProfiles adduserprofile(UserProfiles userprofiles);
	
	public List<UserProfiles> getAlluserprofiles();

}
