package com.giuseppelopes.samples.farmacia;

import java.util.ArrayList;

public class Armario {

	private ArrayList<Medicamento> meuArmario;
	
	public Armario() {
		this.meuArmario = new ArrayList<Medicamento>();
	}
	
	public String toString() {
		return "Este é o meu armario. Ele contém " + meuArmario.size() + " medicamentos";
	}
	
	public Armario add(Medicamento medicamento) {
		this.meuArmario.add(medicamento);
		return this;
	}
	
	public boolean contains(Medicamento medicamento) {
		if (this.meuArmario.contains(medicamento)) {
			return true;
		}
		return false;
	}
	
	public boolean del(Medicamento medicamento) {
		if (this.meuArmario.contains(medicamento)) {
			this.meuArmario.remove(medicamento);
			return true;
		}
		
		return false;
	}
	
	public int count() {
		return this.meuArmario.size();
	}
}
