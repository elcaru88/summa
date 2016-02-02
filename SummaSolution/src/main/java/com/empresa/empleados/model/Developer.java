package com.empresa.empleados.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Developer extends Employee {

	@Column
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
