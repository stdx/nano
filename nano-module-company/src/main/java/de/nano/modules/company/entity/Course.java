package de.nano.modules.company.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String description;

	public String getDescription() {
		return description;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

}
