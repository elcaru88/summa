package com.empresa.empleados.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.empleados.model.Developer;

public interface DeveloperDao extends JpaRepository<Developer, Long> {

	List<Developer> findByCompanyId(Long id_company);
}
