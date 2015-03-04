package com.giuseppelopes;

public class FarmaciaTest {

	public static void main(String args[]) {
		//Criando um medicamento
		Medicamento paracetamol = new Medicamento("Paracetamol");
		
		System.out.println("Testando a bagaça");
		
		System.out.println("Iremos imprimir um medicamento: " + paracetamol.getNome() );
	}
}
