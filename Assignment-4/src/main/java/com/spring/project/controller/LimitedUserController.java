package com.spring.project.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.entity.UserProfiles;
import com.spring.project.repository.UserProfileRepo;

@RestController
@RequestMapping("/users-limited")
public class LimitedUserController {
	
	
	@Autowired
    private UserProfileRepo userProfileRepository;

    @GetMapping()
    public ResponseEntity<List<UserProfiles>> getAllLimitedUsers() {
        List<UserProfiles> userProfiles = userProfileRepository.findAll();
       // List<Integer> limitedUserProfiles = userProfiles.stream()
       //         .map(UserProfiles::getId)
         //       .collect(Collectors.toList());
        
       
        return ResponseEntity.ok(userProfiles);
    }
}
