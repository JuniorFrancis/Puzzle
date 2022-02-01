package com.puzzle.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the banks database table.
 * 
 */
@Embeddable
public class BankPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="user_id")
	private int userId;

	public BankPK() {
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
		if (!(other instanceof BankPK)) {
			return false;
		}
		BankPK castOther = (BankPK)other;
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