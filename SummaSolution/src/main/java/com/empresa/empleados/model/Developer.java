package com.empresa.empleados.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Developer extends Employee {

	@Enumerated(EnumType.STRING)
	private DeveloperLanguage language;

	public DeveloperLanguage getLanguage() {
		return language;
	}

	public void setLanguage(DeveloperLanguage language) {
		this.language = language;
	}

	public String getLanguageName() {
		return language.name();
	}

	public void setLanguageName(String languageName) {
		language = DeveloperLanguage.valueOf(languageName);
	}

}

enum DeveloperLanguage {
	PHP, NET, Python
}
