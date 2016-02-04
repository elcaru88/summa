package com.empresa.empleados.service;

import java.util.List;

import com.empresa.empleados.dto.DesignerDto;
import com.empresa.empleados.dto.DeveloperDto;
import com.empresa.empleados.dto.EmployeeDto;

public interface EmployeeService {

	void addDeveloperOnCompany(DeveloperDto dto, Long companyId);

	void updateDeveloperOnCompany(DeveloperDto dto, Long companyId);

	void addDesignerOnCompany(DesignerDto dto, Long companyId);

	void updateDesignerOnCompany(DesignerDto dto, Long companyId);

	EmployeeDto getEmployeeById(Long employeeId, Long companyId);

	List<EmployeeDto> getEmployeeList();

	List<DeveloperDto> getDeveloperList(Long id_company);

	List<DesignerDto> getDesignerList();

	Double getAvgAge(Long companyId);

}
