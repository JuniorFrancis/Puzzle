package com.puzzle.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * The persistent class for the credit_cards database table.
 * 
 */
@Entity
@Table(name="credit_cards")
@NamedQuery(name="CreditCard.findAll", query="SELECT c FROM CreditCard c")
public class CreditCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="bank_id")
	private int bankId;

	@Column(name="created_at")
	private LocalDate createdAt;

	private String name;

	private int number;

	@Column(name="updated_at")
	private LocalDate updatedAt;

	@Column(name="user_id")
	private int userId;

	public CreditCard() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBankId() {
		return this.bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public LocalDate getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public LocalDate getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}