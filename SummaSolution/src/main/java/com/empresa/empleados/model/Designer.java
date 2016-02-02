package com.empresa.empleados.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Designer extends Employee {

	@Column
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
