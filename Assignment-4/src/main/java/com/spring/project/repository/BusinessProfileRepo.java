package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.entity.BusinessProfile;


@Repository
public interface BusinessProfileRepo  extends JpaRepository<BusinessProfile,Long>{

}
 