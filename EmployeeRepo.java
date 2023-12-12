package com.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.model.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
