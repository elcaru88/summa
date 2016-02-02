package com.empresa.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.empleados.model.Developer;

public interface DeveloperDao extends JpaRepository<Developer, Long> {

}
