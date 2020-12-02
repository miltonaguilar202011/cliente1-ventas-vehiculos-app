package pe.com.arland.ventas1.consultas.excepciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VentasEJemploExcepcion {
	//SINTAXIS ASSERTTHROW : Esperaba NumberFormat Exception Se produce una NumberFormatException
	@Test
	void testAssertThrows1() {
	  // TIPO - EVALUACION
	  Assertions.assertThrows(NumberFormatException.class, () -> {
	    Integer.parseInt("One");
	  });
	}

	//SINTAXIS ASSERTTHROW : Esperaba NumberFormat Exception Se produce una IlegalArgumentException(Esta Contenida en)
	@Test
	void testAssertThrows2() {
	 
	  // TIPO - EVALUACION
	  Assertions.assertThrows(NumberFormatException.class, () -> {
	    Integer.parseInt(null);
	  });
	 
	}
	
	//SINTAXIS ASSERTTHROW : Esperaba NumberFormat Exception Se produce una Number Format Exception
	@Test
	void testAssertThrows3() {
	  // TIPO - EVALUACION
	  Assertions.assertThrows(NumberFormatException.class, () -> {
	   double resultado = (7/0);
	  });
	 
	}
	
	//SINTAXIS ASSERTTHROW : Esperaba NumberFormat Exception No se Produce Excepcion
	@Test
	void testAssertThrows4() {
	  // TIPO - EVALUACION
	  Assertions.assertThrows(NumberFormatException.class, () -> {
		  Integer.parseInt("1");
	  });
	 
	}

    @Test
    void TestAssertThrowPersonalizado() {
    	  //DEFINICION DE UN TIPO DE EXCEPCION ...
          Throwable miException = 
           assertThrows(IllegalArgumentException.class,
            () -> {throw new IllegalArgumentException("Mensaje de mi Excepcion Personal 1");});
         
          //USO DEL ASSERT 1
          assertEquals("Mensaje de mi Excepcion Personal 1", miException.getMessage());
          
        //USO DEL ASSERT 2
          String expectedMessage = "Excepcion Personal";
          String actualMessage = miException.getMessage();
          assertTrue(expectedMessage.contains(expectedMessage));
          
    }

    
    
    
    
    
    
    
    
    
 
}