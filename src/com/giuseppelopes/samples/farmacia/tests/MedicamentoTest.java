package com.giuseppelopes.samples.farmacia.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.giuseppelopes.samples.farmacia.Medicamento;


public class MedicamentoTest {

	@Test
	public void testConstructorSetNomeAndFabricante() {
		String nome = "Paracetamol";
		String fabricante = "Medley";
		Medicamento medicamento = new Medicamento(nome, fabricante);
		assertEquals(nome, medicamento.getNome());
		assertEquals(fabricante, medicamento.getFabricante());
	}

}
