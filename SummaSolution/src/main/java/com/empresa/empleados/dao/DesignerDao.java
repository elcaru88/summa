package com.empresa.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.empleados.model.Designer;

public interface DesignerDao extends JpaRepository<Designer, Long> {

}
