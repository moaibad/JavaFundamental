package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;

@Entity
@Table(name = "person")
public class Mahasiswa extends BaseEntity{
	
	@Column(name = "email", nullable = false, length = 200)
	private String email;
	
	

	public Mahasiswa() {
		super();		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "nim", nullable = false, length = 200)
	private String nim;

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

}
