package com.puzzle.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the categorys database table.
 * 
 */
@Embeddable
public class CategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="user_id")
	private int userId;

	public CategoryPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CategoryPK)) {
			return false;
		}
		CategoryPK castOther = (CategoryPK)other;
		return 
			(this.id == castOther.id)
			&& (this.userId == castOther.userId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.userId;
		
		return hash;
	}
}