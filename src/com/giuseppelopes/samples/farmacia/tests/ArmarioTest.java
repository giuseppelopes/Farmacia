package com.giuseppelopes.samples.farmacia.tests;

import static org.junit.Assert.*;

import org.junit.*;

import com.giuseppelopes.samples.farmacia.Armario;
import com.giuseppelopes.samples.farmacia.Medicamento;

public class ArmarioTest {

	@Test
	public void testAdd() {
		Armario armario = new Armario();
		Medicamento med = new Medicamento("nome", "fabricante");
		assertFalse(armario.contains(med));
		armario.add(med);
		assertTrue(armario.contains(med));
	}

	@Test
	public void testDel() {
		Armario armario = new Armario();
		Medicamento med = new Medicamento("nome", "fabricante");
		armario.add(med);
		assertTrue(armario.contains(med));
		armario.del(med);
		assertFalse(armario.contains(med));
	}

	@Test
	public void testCount() {
		Armario armario = new Armario();
		Medicamento med = new Medicamento("nome", "fabricante");
		
		assertEquals(0, armario.count());
		armario.add(med);
		
		assertEquals(1, armario.count());
		armario.del(med);
		
		assertEquals(0, armario.count());
	}

}
