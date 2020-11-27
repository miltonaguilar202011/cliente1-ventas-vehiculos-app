package pe.com.arland.ventas1.consultas.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.ventas1.repository.mongodb.ComprobanteRepositoryImpl;
import pe.com.arland.ventas1.service.impl.VentasServiceImpl;

public class VentasCollectionTestFactoryDiego_Ramos {
	
	private static VentasServiceImpl serviceVentas = new VentasServiceImpl() ;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("****************************************");
		System.out.println("****	CONFIGURACION DEL ENTORNO  *****");
		System.out.println("****************************************");
     	serviceVentas.setComprobanteDAO(new ComprobanteRepositoryImpl() );
	}
	
	@TestFactory
    Stream<DynamicTest> dynamicTestsFromStream() {
        Stream<FacturaEntity> inputStream = Stream.of(
        		serviceVentas.recuperarFactura("0020", 345L),
        		serviceVentas.recuperarFactura("0020", 346L),
        		serviceVentas.recuperarFactura("0020", 347L)
        		);
        return inputStream.map(input ->
        		dynamicTest("Display name for input " + input,
        				() -> {
        					assertTrue(input.getImporteIVA()>100d);
        			}
        		)
        );
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return Arrays.asList(
                dynamicTest("1st dynamic test", () -> evaluteImportIVA("0020", 345, 2000d)),
                dynamicTest("2st dynamic test", () -> evaluteImportIVA("0020", 346, 1000d)),
                dynamicTest("3st dynamic test", () -> evaluteImportIVA("0020", 347, 4000d)),
                dynamicTest("4st dynamic test", () -> evaluteImportIVA("0020", 348, 20000d))
                );
    }

    
    void evaluteImportIVA(String serieComprobante, long numComprobante, Double ivaMin) {
    	FacturaEntity factura  = serviceVentas.recuperarFactura(serieComprobante, numComprobante);
    	System.out.println("ImporteIVA: " + factura.getImporteIVA());
    	assertTrue(factura.getImporteIVA()>ivaMin);
    }
    
    @AfterAll
	static void afterAll() {
		System.out.println("****************************************");
		System.out.println("****	FIN DE EJECUCION DE TESTS  *****");
		System.out.println("****************************************");
     	serviceVentas.setComprobanteDAO(new ComprobanteRepositoryImpl() );
	}
}
