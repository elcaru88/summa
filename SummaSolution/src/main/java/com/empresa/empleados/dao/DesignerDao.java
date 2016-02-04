package com.empresa.empleados.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.empleados.model.Designer;

public interface DesignerDao extends JpaRepository<Designer, Long> {
	List<Designer> findByCompanyId(Long id_company);
}
