package pe.com.arland.ventas1.testSuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({
		pe.com.arland.cliente1.registro.util.CalculadoraTest.class,
		pe.com.arland.seguridad1.autenticacion.AutenticationServicesTest.class})
public class VentasTestSuite1SelectClasses {

}
