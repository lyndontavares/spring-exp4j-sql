package com.idomine.mbl.businesslanguage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Formula {


	@Id
	@GeneratedValue
	private long id;
	
	private String descricao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Formula [id=" + id + ", descricao=" + descricao + "]";
	}
	
	public Formula() {
	}

	public Formula(long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	
}
