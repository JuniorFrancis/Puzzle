package com.puzzle.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the spendings database table.
 * 
 */
@Embeddable
public class SpendingPK implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="user_id")
	private int userId;

	@Column(name="category_id")
	private int categoryId;

	@Column(name="bank_id")
	private int bankId;

	public SpendingPK() {
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
	public int getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getBankId() {
		return this.bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SpendingPK)) {
			return false;
		}
		SpendingPK castOther = (SpendingPK)other;
		return 
			(this.id == castOther.id)
			&& (this.userId == castOther.userId)
			&& (this.categoryId == castOther.categoryId)
			&& (this.bankId == castOther.bankId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.categoryId;
		hash = hash * prime + this.bankId;
		
		return hash;
	}
}