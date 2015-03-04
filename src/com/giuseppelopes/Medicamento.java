package com.giuseppelopes;

public class Medicamento {
	private String nome;

	public void Medicamento(String nome) {
		if (nome.isEmpty()) {
			this.nome = null;
		} else {
			this.nome = nome;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
