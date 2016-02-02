package com.empresa.empleados.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.empleados.dao.CompanyDao;
import com.empresa.empleados.dto.CompanyDto;

@Service
public class CompanyServiceImp implements CompanyService {

	@Autowired
	CompanyDao dao;

	@Override
	public boolean addCompany(CompanyDto company) {
		dao.saveAndFlush(company.toModel());
		return true;
	}

	@Override
	public boolean updateCompany(CompanyDto company) {
		if (dao.exists(company.getId())) {
			dao.saveAndFlush(company.toModel());
			return true;
		} else {
			return true;
		}
	}

	@Override
	public CompanyDto findCompanyById(Integer companyId) {
		CompanyDto result = new CompanyDto(dao.findOne(Long.valueOf(companyId)));
		return result;
	}

	@Override
	public boolean deleteCompanyWithId(Integer companyId) {
		if (dao.exists(Long.valueOf(companyId))) {
			dao.delete(Long.valueOf(companyId));
			return true;
		} else {
			return true;
		}
	}

}
