package pe.com.arland.cliente1.registro.terceros;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import pe.com.arland.cliente1.registro.entity.DireccionEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.ClientesRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.UsuariosAplicacionRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.service.impl.AutenticacionServiceImpl;

@DisplayName ("SERVICIO DE TERCEROS")
class TercerosTest {

	private static String codUsuario = null;
	private static String password = null;
	private static AutenticacionServiceImpl serviceAuth = new AutenticacionServiceImpl() ;
		
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
	     	serviceAuth.setClienteDAO(new ClientesRepositoryImpl() );
	     	serviceAuth.setUsuarioDAO(new UsuariosAplicacionRepositoryImpl());

		}

		
		@Tag("Individual")
		@DisplayName ("AUTENTICACION - Comparacion de objetos Direccion USR2002, USR2005")
		@Test
		void testEscenario5ComparaObjetos() {
			 
			//*RECUPERACION DE OBJETO
	     	//USR2002,USR2005
	     	UsuarioAplicacionEntity usuario1  = serviceAuth.validarUsuarioAplicacionporCodUsuario("USR2002", "pwdUSR2002");
	     	UsuarioAplicacionEntity usuario2  = serviceAuth.validarUsuarioAplicacionporCodUsuario("USR2005", "pwdUSR2005");
	 
	     	DireccionEntity direccion1 = usuario1.getDirecciones().iterator().next();
	    	DireccionEntity direccion2 = usuario2.getDirecciones().iterator().next();
	    	DireccionEntity  direccion3 = direccion1;
	    	
	    	//EJEMPLO ASSER SAME - SI AMBAS DIRECCIONES SON LAS MISMAS VIVEN EN EL MISMO LUGAR
	    	//assertSame(direccion1,direccion3,"Ambas direcciones son las mismas");
	    	//assertThat(direccion1, equalTo(direccion2));
	    	
	    	//EJEMPLO ASSER SAME - SI AMBAS DIRECCIONES SON LAS MISMAS VIVEN EN EL MISMO LUGAR
	    	assertSame(direccion1,direccion2,"Ambas direcciones NO son las mismas");

	    	
		}

}
