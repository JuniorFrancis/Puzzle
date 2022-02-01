package com.puzzle.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * The persistent class for the banks database table.
 * 
 */
@Entity
@Table(name="banks")
@NamedQuery(name="Bank.findAll", query="SELECT b FROM Bank b")
public class Bank implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BankPK id;

	private int balance;
	
	@Column(name="created_at")
	private LocalDate createdAt;
	
	@Column(name="updated_at")
	private LocalDate updatedAt;
	private String name;

	public Bank() {
	}

	public BankPK getId() {
		return this.id;
	}

	public void setId(BankPK id) {
		this.id = id;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
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

	public LocalDate getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

}