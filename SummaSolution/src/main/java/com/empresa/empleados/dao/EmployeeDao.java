package com.empresa.empleados.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.empresa.empleados.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

	Double getAvgAge(@Param("companyId") Long companyId);

	List<Employee> findByCompanyId(Long id_company);

	Employee findByIdAndCompanyId(Long id, Long id_company);

}
