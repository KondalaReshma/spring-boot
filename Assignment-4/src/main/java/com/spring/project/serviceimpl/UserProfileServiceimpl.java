package com.spring.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.entity.UserProfiles;
import com.spring.project.repository.UserProfileRepo;
import com.spring.project.service.UserProfileService;


@Service
public class UserProfileServiceimpl  implements UserProfileService {
	
	@Autowired
	private UserProfileRepo  userprofilerepo;

	@Override
	public List<UserProfiles> getAlluserprofiles() {
		List<UserProfiles> userprofile = userprofilerepo.findAll();
		return userprofile;
	}

	@Override
	public   UserProfiles adduserprofile(UserProfiles userprofiles) {
		// TODO Auto-generated method stub
		
		return userprofilerepo.save(userprofiles);
		
	}

}
