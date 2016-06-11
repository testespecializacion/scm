package co.edu.usbcali.scm;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void atest() {
		Calculadora c= new CalculadoraImp();
			
		c.sumar(4, 4);
		assertTrue(c.getResultado() == 8);
	}
	
	@Test
	public void btest() {
		Calculadora c= new CalculadoraImp();
			
		c.restar(4, 4);
		assertTrue(c.getResultado() == 0);
	}

}
