package com.puzzle.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * The persistent class for the spendings database table.
 * 
 */
@Entity
@Table(name="spendings")
@NamedQuery(name="Spending.findAll", query="SELECT s FROM Spending s")
public class Spending implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SpendingPK id;

	@Column(name="card_id")
	private int cardId;

	@Column(name="created_at")
	private LocalDate createdAt;

	private String description;

	private String name;

	private String type;

	@Column(name="updated_at")
	private LocalDate updatedAt;

	private float value;

	public Spending() {
	}

	public SpendingPK getId() {
		return this.id;
	}

	public void setId(SpendingPK id) {
		this.id = id;
	}

	public int getCardId() {
		return this.cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public LocalDate getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	public float getValue() {
		return this.value;
	}

	public void setValue(float value) {
		this.value = value;
	}

}