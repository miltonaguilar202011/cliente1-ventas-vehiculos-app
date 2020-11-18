package pe.com.arland.cliente1.registro.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TEST CICLO DE VIDA DE CALCULADORE")
class CalculadoraTest {

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

}
