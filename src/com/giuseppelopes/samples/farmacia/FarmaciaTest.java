package com.giuseppelopes.samples.farmacia;

public class FarmaciaTest {

	public static void main(String args[]) {
		//Criando um medicamento
		Medicamento paracetamol = new Medicamento("Paracetamol", "Medley");
		
		System.out.println("Testando a baga�a");
		
		System.out.println("Iremos imprimir um medicamento: " + paracetamol.getNome() + " ele � do laboratorio: ");
		
		Armario objetoArmario = new Armario();
		
		System.out.println(objetoArmario);
	}
}
