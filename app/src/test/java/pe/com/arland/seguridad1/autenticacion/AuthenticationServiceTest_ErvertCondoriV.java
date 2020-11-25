package pe.com.arland.seguridad1.autenticacion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pe.com.arland.cliente1.registro.entity.DireccionEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.ClientesRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.UsuariosAplicacionRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.service.impl.AutenticacionServiceImpl;


public class AuthenticationServiceTest_ErvertCondoriV {
	
	private static String codUser = null;
	private static String pasww = null;
	private static AutenticacionServiceImpl serviceAuth = new AutenticacionServiceImpl ();
	
	@DisplayName ("CONFIGURACION")
	@BeforeAll
	static void configuracionDelEscenario () {
	System.out.println("------starting ------");
	
	serviceAuth.setClienteDAO(new ClientesRepositoryImpl());
	serviceAuth.setUsuarioDAO(new UsuariosAplicacionRepositoryImpl());
	}
	
	@BeforeEach
	 void configuracionCadaPrueba () {
		System.out.println("------antes de prueba ------");
		codUser="USR002";
		//pasww="pwdUSR002";
		pasww="";
	}
	
	@DisplayName("AUth - Clientes reg")
	@Test
	void testStage1() {
	 assertNotNull(codUser,"Cod. user is null");
	 assertNotNull(pasww,"pwd. user is null");
		
	// if(codUser.isEmpty()|| pasww.isEmpty()) {
	//	 fail("user code or pasww are empty");
	// }	 
	 
	}
	
	@DisplayName("AUth - comparacion de obj")
	@Test
	void testStage2() {
		UsuarioAplicacionEntity user1 = serviceAuth.validarUsuarioAplicacionporCodUsuario("USR2002", "pwdUSR2002");
		UsuarioAplicacionEntity user2 = serviceAuth.validarUsuarioAplicacionporCodUsuario("USR2005", "pwdUSR2005");
		DireccionEntity d1 = user1.getDirecciones().iterator().next();
		DireccionEntity d2 = user2.getDirecciones().iterator().next();
		DireccionEntity d3 = d1;
		
		assertSame(d1, d3,"is the same both address");
		//assertSame(d1, d2,"the address are diferent");
	}

}
