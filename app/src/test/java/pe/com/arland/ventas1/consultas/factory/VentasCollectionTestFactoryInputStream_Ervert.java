package pe.com.arland.ventas1.consultas.factory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.ventas1.repository.mongodb.ComprobanteRepositoryImpl;
import pe.com.arland.ventas1.service.impl.VentasServiceImpl;

class VentasCollectionTestFactoryInputStream_Ervert {

	private static VentasServiceImpl serviceVentas = new VentasServiceImpl() ;
	
	@Tag("Funcional")
	@DisplayName ("CONFIGURACION DEL ENTORNO")
	@BeforeAll
	static void configuracionDelEscenario() {
		System.out.println("****************************************");
		System.out.println("**	dinamic compr0bante  **");
		System.out.println("****************************************");
     	serviceVentas.setComprobanteDAO(new ComprobanteRepositoryImpl() );
 
	}
	 @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	  @TestFactory
	    Stream<DynamicTest> dynamicTestsFromStream() {
	        Stream<String> inputStream = Stream.of("0020", "0021", "0022", "0023");
	        
	        return inputStream.map(input ->
	        		dynamicTest("Display name for input " + input,() -> {

	        			FacturaEntity factura  = serviceVentas.recuperarFactura(input, (long) 345);
	        			assertTrue(factura.getMontoComprobante()>10000);
	        			System.out.println("Testing " + input);
	        			}
	        		)
	        );
	    }
	  
	  
}
