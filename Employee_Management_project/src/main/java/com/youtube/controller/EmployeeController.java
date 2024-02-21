package com.youtube.controller;

import org.apache.el.stream.Optional;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.model.Employee;
import com.youtube.repository.EmployeeRepo;
import com.youtube.serviceIMPL.EmployeeServiceImpl;

@RestController

@RequestMapping("/emp")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeServiceImpl empservice ;

	
	@GetMapping("/home")
	public String homepage() {
		return "Welcome  to Empl";
	}
 
	@PostMapping("/addEmp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		
		Employee emp = empservice.addEmployee(employee);
		return  new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/removeEmp/{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable int id ){
		
		empservice.removeEmployee(id);
		return new ResponseEntity<String>("Remove succesfully",HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/findEmp/{id}")
	 public ResponseEntity<java.util.Optional<Employee>> findEmployeeById(@PathVariable int id){
		 
		  
		//Optional<Employee>emps= //empservice.findById(id);
		 return  ResponseEntity.ok(empservice.findEmpById(id));
		 
	 }
	
	
	@GetMapping("/all")
	
	public ResponseEntity<List> listofEmployees(){	
		
		List lEmp = (List) empservice.getAllEmployee();
		
		return new ResponseEntity<List>(lEmp,HttpStatus.ACCEPTED);
		

		
		
	
	}
}
