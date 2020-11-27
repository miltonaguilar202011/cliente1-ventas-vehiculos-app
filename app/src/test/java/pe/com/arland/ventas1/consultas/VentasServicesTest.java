package pe.com.arland.ventas1.consultas;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import pe.com.arland.cliente1.registro.entity.BoletaEntity;
import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.DireccionEntity;
import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.cliente1.registro.util.Calculadora;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.ClientesRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.UsuariosAplicacionRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.service.impl.AutenticacionServiceImpl;
import pe.com.arland.ventas1.repository.mongodb.ComprobanteRepositoryImpl;
import pe.com.arland.ventas1.service.impl.VentasServiceImpl;

@DisplayName ("SERVICIO DE CONSULTA VENTAS")
class VentasServicesTest {

	private static VentasServiceImpl serviceVentas = new VentasServiceImpl() ;
	
	@Tag("Funcional")
	@DisplayName ("CONFIGURACION DEL ENTORNO")
	@BeforeAll
	static void configuracionDelEscenario() {
		System.out.println("****************************************");
		System.out.println("**	ETAPA :CONFIGURACION DEL ENTORNO  **");
		System.out.println("****************************************");
		System.out.println("**  AMBIENTE DE PRUEBA                **");
		System.out.println("****************************************");
		System.out.println("**  REGISTRO DE DATOS DE PRUEBA       **");
		System.out.println("****************************************");
     	serviceVentas.setComprobanteDAO(new ComprobanteRepositoryImpl() );
	}

	@DisplayName ("CONFIGURACION DE CADA PRUEBA")
	@BeforeEach
	void configuracionCadaPrueba() {
		System.out.println("******************************************************");
		System.out.println("** ETAPA :CONFIGURACION PREVIA ANTES DE CADA PRUEBA **");
		System.out.println("******************************************************");
	}
	
	/* Validacion de clientes que se registraron como usuarios efectivamente estan actualizando sus datos */
	@DisplayName ("VENTAS CONSULTA DE COMPROBANTES  - Consulta de Comprobantes")
	@Test
	void testVentasConsultaComprobantes() {

		//*EJEMPLO ASUME 
     	//USR2001,USR2002,USR2003

		
     	FacturaEntity factura1  = serviceVentas.recuperarFactura("0020", (long) 345);
     	FacturaEntity factura2  = serviceVentas.recuperarFactura("0020", (long) 346);
     	FacturaEntity factura3  = serviceVentas.recuperarFactura("0020", (long) 347);
     	FacturaEntity factura4  = serviceVentas.recuperarFactura("0020", (long) 348);
    	FacturaEntity factura5  = serviceVentas.recuperarFactura("0020", (long) 349); 	
 
    	// ASUME TRUE - FALSE
    	// Validar que la mitad del importe es mayor que 10000
    	
    	FacturaEntity facturaEvaluacion = null;
    	//ASUME FALSE 
    	//facturaEvaluacion = factura2;
    	
    	//ASUME TRUE
    	//facturaEvaluacion = factura5;
    	
    	try {
    		//ASUME FALSE - SI LA CONDICION INTERNA ES FALSA YA NO CONTINUA EVALUANDO
    		assumeFalse(facturaEvaluacion == null);
    		assertTrue(facturaEvaluacion.getMontoComprobante()/2 > 20000);
    		//ASUME TRUE - SI LA CONDICION INTERNA ES VERDADERA YA NO CONTINUA EVALUANDO
    		//assumeTrue(facturaEvaluacion == null);
    		//assertTrue(facturaEvaluacion.getMontoComprobante()/2 > 20000);
 		} catch (Exception e) {
 			String ERR = e.getMessage();
		}
    	 
    	

	}
	

	@DisplayName ("LIBERACION DE DATOS DE CADA PRUEBA")
	@BeforeEach
	void restauracionDeCadaPrueba() {
		System.out.println("******************************************************");
		System.out.println("** ETAPA :CONFIGURACION PREVIA ANTES DE CADA PRUEBA **");
		System.out.println("******************************************************");
	}

	
	@DisplayName ("RESTAURACION DEL ENTORNO")
	@AfterAll
	static void restauracionDelEscenario() {
		System.out.println("****************************************");
		System.out.println("**	ETAPA :RECONFIGURACION DEL ENTORNO  **");
		System.out.println("****************************************");
		System.out.println("**  ELIMINACION DE DATOS DE PRUEBA  ***");
		System.out.println("****************************************");
	}
}
