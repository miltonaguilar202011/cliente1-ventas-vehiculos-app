package pe.com.arland.ventas1.consultas.factory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.ventas1.repository.mongodb.ComprobanteRepositoryImpl;
import pe.com.arland.ventas1.service.impl.VentasServiceImpl;

class VentasCollectionTestFactoryInputStream2 {

	private static VentasServiceImpl serviceVentas = new VentasServiceImpl() ;
	 
	  @TestFactory
	    Stream<DynamicTest> dynamicTestsFromStream() {
		  
		  FacturaEntity factura1  = serviceVentas.recuperarFactura("0020", (long) (345));
		  FacturaEntity factura2  = serviceVentas.recuperarFactura("0020", (long) (346));
		  FacturaEntity factura3  = serviceVentas.recuperarFactura("0020", (long) (347));
		  
	      //  Stream<String> inputStream = Stream.of("A", "B", "C");
		  Stream<String> inputStream = Stream.of(factura1.getIdContribuyente(), factura2.getIdContribuyente(), factura3.getIdContribuyente());
	      return inputStream.map(input ->
	        		dynamicTest("Display name for input " ,() -> {System.out.println("Testing " + input);}
	        		)
	        );
	    }
}
