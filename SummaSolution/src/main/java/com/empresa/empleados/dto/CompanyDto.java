package com.empresa.empleados.dto;

import java.util.List;

import com.empresa.empleados.model.Company;
import com.empresa.empleados.model.Employee;

public class CompanyDto {
	private Long id;
	private String name;
	private List<Employee> employees;

	public CompanyDto() {

	}

	public CompanyDto(Company model) {
		this.setId(model.getId());
		this.setName(model.getName());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Company toModel() {
		Company model = new Company();
		model.setName(this.getName());
		model.setId(this.getId());
		return model;
	}
}
