package com.empresa.empleados.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.empleados.dto.DesignerDto;
import com.empresa.empleados.dto.DeveloperDto;
import com.empresa.empleados.dto.EmployeeDto;
import com.empresa.empleados.service.EmployeeService;

@RestController
@RequestMapping("/{companyId}/employees")
public class EmployeeRest {

	@Autowired
	EmployeeService service;

	@RequestMapping(method = RequestMethod.POST, path = "/developer")
	public ResponseEntity<String> addDeveloper(@RequestBody DeveloperDto developer, @PathVariable String companyId) {
		try {
			service.addDeveloperOnCompany(developer, Long.valueOf(companyId));
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Added", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/developer")
	public ResponseEntity<String> updateDeveloper(@RequestBody DeveloperDto developer, @PathVariable String companyId) {
		try {
			service.updateDeveloperOnCompany(developer, Long.valueOf(companyId));
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Added", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/developers")
	public ResponseEntity<List<DeveloperDto>> getDeveloperList(@PathVariable String companyId) {
		List<DeveloperDto> developers = null;
		try {
			developers = service.getDeveloperList(Long.valueOf(companyId));
		} catch (Exception e) {
			return new ResponseEntity<List<DeveloperDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<DeveloperDto>>(developers, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/designer")
	public ResponseEntity<String> addDesigner(@RequestBody DesignerDto designer, @PathVariable String companyId) {
		try {
			service.addDesignerOnCompany(designer, Long.valueOf(companyId));
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Added", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/designer")
	public ResponseEntity<String> updateDesigner(@RequestBody DesignerDto designer, @PathVariable String companyId) {
		try {
			service.updateDesignerOnCompany(designer, Long.valueOf(companyId));
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Added", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/designers")
	public ResponseEntity<List<DesignerDto>> getDesignerList(@PathVariable String companyId) {
		List<DesignerDto> designers = null;
		try {
			designers = service.getDesignerList();
		} catch (Exception e) {
			return new ResponseEntity<List<DesignerDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<DesignerDto>>(designers, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{employeeId}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable String companyId,
			@PathVariable String employeeId) {
		EmployeeDto response = null;
		try {
			response = service.getEmployeeById(Long.valueOf(employeeId), Long.valueOf(companyId));
		} catch (Exception e) {
			return new ResponseEntity<EmployeeDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<EmployeeDto>(response, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeDto>> getEmployees() {
		List<EmployeeDto> response = null;
		try {
			response = service.getEmployeeList();
		} catch (Exception e) {
			return new ResponseEntity<List<EmployeeDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<EmployeeDto>>(response, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/avgage")
	public ResponseEntity<Double> getAverageAge(@PathVariable String companyId) {
		Double response = null;
		try {
			response = service.getAvgAge(Long.valueOf(companyId));
		} catch (Exception e) {
			return new ResponseEntity<Double>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Double>(response, HttpStatus.OK);
	}

}
