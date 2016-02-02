package com.empresa.empleados.dto;

import com.empresa.empleados.model.Employee;

public abstract class EmployeeDto {
	private Long id;
	private String firstName;
	private String lastName;
	private int age;
	private CompanyDto company;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CompanyDto getCompany() {
		return company;
	}

	public void setCompany(CompanyDto company) {
		this.company = company;
	}

	public void setCompanyId(Long id) {
		CompanyDto company = new CompanyDto();
		company.setId(id);
		this.company = company;
	}

	abstract public EmployeeDto modelToDto(Employee employee);

}
