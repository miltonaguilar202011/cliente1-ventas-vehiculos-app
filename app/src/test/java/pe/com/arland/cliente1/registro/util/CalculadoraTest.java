package pe.com.arland.cliente1.registro.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TEST CICLO DE VIDA DE CALCULADORE")
public class CalculadoraTest {

	@DisplayName("Test Calculadora Suma")
	@Test
	void testSuma() {
		double esperado = 50; // 30 + 20 
		double resultado = Calculadora.suma(30, 20);
		assertEquals(esperado,resultado);
	}
	
	@DisplayName("Test Calculadora Resta")
	@Test
	void testResta() {
		double esperado = 10; // 30 - 20 
		double resultado = Calculadora.resta(30, 20);
		assertEquals(esperado,resultado);
	}
	
	
	@DisplayName("Test Calculadora Multiplicacion")
	@Test
	void testMultiplicacion() {
		double esperado = 600; // 20 * 30
		double resultado = Calculadora.multiplicacion(20, 30);
		assertEquals(esperado,resultado);
	}
	
	@DisplayName("Test Calculadora Division")
	@Test
	void testDivision() {
		double esperado = 2; // 40 / 20
		double resultado = Calculadora.division(40, 20);
		assertEquals(esperado,resultado);
	}
	
	@Test
	void testDivision2() {
		double esperado = 4;// 50 / 10
		double resultado = Calculadora.division(50,0);
		assertEquals(esperado, resultado);
	}

	
	@Test()
	void testDivision4() {
		try {
			double esperado = 4;// 50 / 10
			double resultado = Calculadora.division(50,0);// 50 / 10
			assertEquals(esperado, resultado);
			
		} catch (Exception e) {
			if (e.getClass() == ArithmeticException.class) {
				assertEquals("No se puede dividir entre cero", e.getLocalizedMessage());
			} 
			else {
				fail("Error no controlado");
			}
			
		}
		
	}
}
