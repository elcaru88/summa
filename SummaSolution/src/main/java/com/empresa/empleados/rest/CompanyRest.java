package com.empresa.empleados.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.empleados.dto.CompanyDto;
import com.empresa.empleados.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyRest {

	@Autowired
	CompanyService service;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> addCompany(@RequestBody CompanyDto company) {
		try {
			service.addCompany(company);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Added", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<String> updateCompany(@RequestBody CompanyDto company) {
		try {
			service.updateCompany(company);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Updated", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{companyId}")
	public ResponseEntity<CompanyDto> findCompany(@PathVariable String companyId) {
		CompanyDto response = null;
		try {
			response = service.findCompanyById(Integer.parseInt(companyId));
		} catch (Exception e) {
			return new ResponseEntity<CompanyDto>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<CompanyDto>(response, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/{companyId}")
	public ResponseEntity<String> deleteCompany(@PathVariable String companyId) {
		try {
			service.deleteCompanyWithId(Integer.parseInt(companyId));
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Delted company: " + companyId, HttpStatus.OK);
	}

}
