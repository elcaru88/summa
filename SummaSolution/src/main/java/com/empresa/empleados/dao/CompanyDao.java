package com.empresa.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.empleados.model.Company;

public interface CompanyDao extends JpaRepository<Company, Long> {

}
