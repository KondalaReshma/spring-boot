package com.youtube.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
}
