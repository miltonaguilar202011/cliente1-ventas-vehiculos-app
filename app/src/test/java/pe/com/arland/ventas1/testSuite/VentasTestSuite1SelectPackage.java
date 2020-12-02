package pe.com.arland.ventas1.testSuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectPackages({
	"pe.com.arland.cliente1.registro.util",
	"pe.com.arland.cliente1.registro.terceros"})
public class VentasTestSuite1SelectPackage {

}


