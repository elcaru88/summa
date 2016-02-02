package com.empresa.empleados.dto;

import com.empresa.empleados.model.Designer;
import com.empresa.empleados.model.Employee;

public class DesignerDto extends EmployeeDto {
	private String type;

	public DesignerDto() {

	}

	public DesignerDto(Designer model) {
		this.setAge(model.getAge());
		this.setFirstName(model.getFirstName());
		this.setId(model.getId());
		this.setLastName(model.getLastName());
		this.setType(model.getType());
		this.setCompany(new CompanyDto(model.getCompany()));
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Designer toModel() {
		Designer model = new Designer();
		model.setAge(this.getAge());
		model.setFirstName(this.getFirstName());
		model.setId(this.getId());
		model.setLastName(this.getLastName());
		model.setType(this.getType());
		model.setCompany(this.getCompany().toModel());
		return model;
	}

	@Override
	public EmployeeDto modelToDto(Employee employee) {
		return new DesignerDto((Designer) employee);
	}

}
