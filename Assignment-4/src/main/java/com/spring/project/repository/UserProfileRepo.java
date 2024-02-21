package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.entity.UserProfiles;


@Repository
public interface UserProfileRepo extends JpaRepository<UserProfiles,Integer> {

}
