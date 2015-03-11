package com.giuseppelopes.samples.farmacia;

public class Medicamento {
	private String nome;
	private String fabricante;

	public Medicamento(String nome, String fabricante) {
		this.setNome(nome);
		this.setFabricante(fabricante);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isEmpty()) {
			this.nome = null;
		} else {
			this.nome = nome;
		}
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
