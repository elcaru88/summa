package com.empresa.empleados.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Designer extends Employee {

	@Enumerated(EnumType.STRING)
	private DesignerType type;

	public DesignerType getType() {
		return type;
	}

	public void setType(DesignerType type) {
		this.type = type;
	}

	public String getTypeName() {
		return type.name();
	}

	public void setTypeName(String type) {
		this.type = DesignerType.valueOf(type);
	}

}

enum DesignerType {
	Grafico, Web
}