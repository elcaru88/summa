package com.empresa.empleados.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.empleados.dao.CompanyDao;
import com.empresa.empleados.dao.DesignerDao;
import com.empresa.empleados.dao.DeveloperDao;
import com.empresa.empleados.dao.EmployeeDao;
import com.empresa.empleados.dto.DesignerDto;
import com.empresa.empleados.dto.DeveloperDto;
import com.empresa.empleados.dto.EmployeeDto;
import com.empresa.empleados.model.Designer;
import com.empresa.empleados.model.Developer;
import com.empresa.empleados.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	DesignerDao designerDao;

	@Autowired
	DeveloperDao developerDao;

	@Autowired
	CompanyDao companyDao;

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void addDeveloperOnCompany(DeveloperDto dto, Long companyId) {
		dto.setCompanyId(companyId);
		developerDao.saveAndFlush(dto.toModel());
	}

	@Override
	public void updateDeveloperOnCompany(DeveloperDto dto, Long companyId) {
		dto.setCompanyId(companyId);
		developerDao.saveAndFlush(dto.toModel());
	}

	@Override
	public void addDesignerOnCompany(DesignerDto dto, Long companyId) {
		dto.setCompanyId(companyId);
		designerDao.saveAndFlush(dto.toModel());
	}

	@Override
	public void updateDesignerOnCompany(DesignerDto dto, Long companyId) {
		dto.setCompanyId(companyId);
		designerDao.saveAndFlush(dto.toModel());
	}

	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		return modelToDto(employeeDao.findOne(employeeId));
	}

	@Override
	public List<EmployeeDto> getEmployeeList() {
		List<Employee> employees = employeeDao.findAll();
		List<EmployeeDto> result = new ArrayList<EmployeeDto>();
		for (Employee employee : employees) {
			result.add(modelToDto(employee));
		}
		return result;
	}

	private EmployeeDto modelToDto(Employee employee) {
		EmployeeDto employeeDto = null;
		if (employee instanceof Designer) {
			employeeDto = new DesignerDto((Designer) employee);
		} else if (employee instanceof Developer) {
			employeeDto = new DeveloperDto((Developer) employee);
		}
		return employeeDto;
	}

	@Override
	public List<DeveloperDto> getDeveloperList() {
		List<Developer> developers = developerDao.findAll();
		List<DeveloperDto> developersDto = new ArrayList<DeveloperDto>();
		for (Developer developer : developers) {
			developersDto.add(new DeveloperDto(developer));
		}
		return developersDto;
	}

	@Override
	public List<DesignerDto> getDesignerList() {
		List<Designer> designers = designerDao.findAll();
		List<DesignerDto> designersDto = new ArrayList<DesignerDto>();
		for (Designer designer : designers) {
			designersDto.add(new DesignerDto(designer));
		}
		return designersDto;
	}

}
