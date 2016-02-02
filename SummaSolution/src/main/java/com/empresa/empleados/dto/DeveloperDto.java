package com.empresa.empleados.dto;

import com.empresa.empleados.model.Developer;
import com.empresa.empleados.model.Employee;

public class DeveloperDto extends EmployeeDto {
	private String language;

	public DeveloperDto() {

	}

	public DeveloperDto(Developer model) {
		this.setAge(model.getAge());
		this.setFirstName(model.getFirstName());
		this.setId(model.getId());
		this.setLastName(model.getLastName());
		this.setLanguage(model.getLanguage());
		this.setCompany(new CompanyDto(model.getCompany()));
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Developer toModel() {
		Developer model = new Developer();
		model.setAge(this.getAge());
		model.setFirstName(this.getFirstName());
		model.setId(this.getId());
		model.setLastName(this.getLastName());
		model.setLanguage(this.getLanguage());
		model.setCompany(this.getCompany().toModel());
		return model;
	}

	@Override
	public EmployeeDto modelToDto(Employee employee) {
		return new DeveloperDto((Developer) employee);
	}
}
