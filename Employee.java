package com.amit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String department;
	private int joning_date;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getJoning_date() {
		return joning_date;
	}

	public void setJoning_date(int joning_date) {
		this.joning_date = joning_date;
	}

	public Employee(int id, String name, String email, String department, int joning_date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.joning_date = joning_date;
	}
	

}
