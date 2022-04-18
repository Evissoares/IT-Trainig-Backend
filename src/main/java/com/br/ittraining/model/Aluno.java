package com.br.ittraining.model;

import javax.persistence.Entity;

@Entity
public class Aluno extends Usuario{

	public Aluno(Long id, String nome) {
		super(id, nome);
	}

}
