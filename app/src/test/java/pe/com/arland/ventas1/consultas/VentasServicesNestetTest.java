package pe.com.arland.ventas1.consultas;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
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
class VentasServicesNestetTest {

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

	@Nested // FACTURAS MAYORES A 10000 BOLETAS MAYORES A 300
	class VentasMayores{
		
		@DisplayName ("VENTAS CONSULTA DE COMPROBANTES  - CONSULTA DE FACTURAS")
		@Test
		void testVentasConsultaFacturas() {

			//*EJEMPLO NESTED CLASS
			System.out.println("******************************************************");
			System.out.println("** ETAPA : PRUEBAS DE FACTURAS **");
			System.out.println("******************************************************");
	     	FacturaEntity factura  = serviceVentas.recuperarFactura("0020", (long) 345);
	     	assertTrue(factura.getMontoComprobante()>10000);
		}
		@DisplayName ("VENTAS CONSULTA DE COMPROBANTES  - CONSULTA DE BOLETAS")
		@Test
		void testVentasConsultaBoletas() {

			//*EJEMPLO NESTED CLASS
			System.out.println("******************************************************");
			System.out.println("** ETAPA : PRUEBAS DE FACTURAS **");
			System.out.println("******************************************************");
	     	BoletaEntity boleta  = serviceVentas.recuperarBoleta("0001", (long) 3008);
	     	assertTrue(boleta.getMontoComprobante()>100);

		}
	}
	
	@Nested
	class VentasMenores{
		
		@DisplayName ("VENTAS CONSULTA DE COMPROBANTES  - CONSULTA DE FACTURAS")
		@Test
		void testVentasFacturasMontosMenores10000() {

			//*EJEMPLO NESTED CLASS
			System.out.println("******************************************************");
			System.out.println("** ETAPA : PRUEBAS DE FACTURAS **");
			System.out.println("******************************************************");
	     	FacturaEntity factura  = serviceVentas.recuperarFactura("0020", (long) 345);
	     	assertTrue(factura.getMontoComprobante()<10000);
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
