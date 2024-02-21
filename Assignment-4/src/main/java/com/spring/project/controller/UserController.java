package com.spring.project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.entity.BusinessProfile;
import com.spring.project.entity.UserProfiles;
import com.spring.project.repository.BusinessProfileRepo;
import com.spring.project.repository.UserProfileRepo;
import com.spring.project.service.UserProfileService;



@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserProfileRepo userprofilerepo;
	
	
	@Autowired
	private BusinessProfileRepo businessProfileRepo;
	
	
	@GetMapping("/home")
	public String homepage() {
		return "Welcome  to profiles";
	}
	
	
	
	 @GetMapping("/users")
	    public ResponseEntity<List<UserProfiles>> getAllUsers() {
	        List<UserProfiles> userProfiles = userprofilerepo.findAll();
	        List<BusinessProfile> businessProfiles = businessProfileRepo.findAll();
	        

	        return ResponseEntity.ok(userProfiles);
	    }
 
	 
	 
	 
	 
	}

