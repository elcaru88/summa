package com.empresa.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.empleados.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

	Double getAvgAge();

}
