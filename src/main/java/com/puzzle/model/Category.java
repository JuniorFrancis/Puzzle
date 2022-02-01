package com.puzzle.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="categorys")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CategoryPK id;

	private String description;

	private String name;

	public CategoryPK getId() {
		return this.id;
	}

	public void setId(CategoryPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}