package com.giuseppelopes.teste.farmacia;

public class Medicamento {
	private String nome;
	private String fabricante;

	public Medicamento(String nome, String fabricante) {
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
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		if (fabricante.isEmpty()) {
			this.fabricante = null;
		} else {
			this.fabricante = fabricante;
		}
	}
}
