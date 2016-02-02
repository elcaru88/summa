package com.empresa.empleados.service;

import com.empresa.empleados.dto.CompanyDto;

public interface CompanyService {

	boolean addCompany(CompanyDto company);

	boolean updateCompany(CompanyDto company);

	CompanyDto findCompanyById(Integer companyId);
	
	boolean deleteCompanyWithId(Integer companyId);

}
