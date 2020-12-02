package pe.com.arland.ventas1.testSuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectPackages("pe.com.arland.ventas1.consultas")
@IncludePackages("pe.com.arland.ventas1.consultas.conversion")
public class VentasTestSuite1SelectPackageInclude {

}


