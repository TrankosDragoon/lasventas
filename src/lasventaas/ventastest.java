package lasventaas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ventastest {

	@Test
	public void test() {
		
		assertEquals("Te han vendido",lasventas.resultado());
		assertEquals("Fracaso",lasventas.resultado());
		assertEquals("Fracaso",lasventas.resultado());
		assertEquals("Fracaso",lasventas.resultado());
		assertEquals("Te han vendido",lasventas.resultado());
		assertEquals("Te han vendido",lasventas.resultado());
		
		
	}}

	
