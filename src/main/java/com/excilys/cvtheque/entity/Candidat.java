package com.excilys.cvtheque.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Candidat implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Candidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Champs definis avec Brice
}
