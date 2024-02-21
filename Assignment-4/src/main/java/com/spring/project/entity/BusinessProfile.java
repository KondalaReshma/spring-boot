package com.spring.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BusinessProfile {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private String companyName;
  private String industry;
  
  
  
  
public BusinessProfile() {
	super();
	// TODO Auto-generated constructor stub
}




public BusinessProfile( String companyName, String industry) {
	super();
	
	this.companyName = companyName;
	this.industry = industry;
}




public Long getId() {
	return id;
}




public void setId(Long id) {
	this.id = id;
}




public String getCompanyName() {
	return companyName;
}




public void setCompanyName(String companyName) {
	this.companyName = companyName;
}




public String getIndustry() {
	return industry;
}




public void setIndustry(String industry) {
	this.industry = industry;
}


  
  

}
