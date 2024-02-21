package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/getstudent")
	public String getstudent() {
		return "Successfully retrived  studentname";
	}
	
	
	@PostMapping("/getstudentname")
	public String getname() {
		return "successfully fetched student name";
	}
	
	
	@DeleteMapping("/deletestudent")
	public String  deletestudent() {
		return "student record deleted successfully";
	}
	
	
	@PutMapping("/updatestudent")
	
	public String updatestudent() {
		return "student record updated succesfully";
	}

}
