package com.giuseppelopes;

import java.util.ArrayList;

public class Armario {

	private ArrayList<Medicamento> meuArmario;
	
	public Armario() {
		this.meuArmario = new ArrayList<Medicamento>();
	}
	
	public String toString() {
		return "Este � o meu armario legal!";
	}
}
