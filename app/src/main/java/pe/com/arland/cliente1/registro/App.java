/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pe.com.arland.cliente1.registro;

import java.util.Scanner;

import pe.com.arland.cliente1.registro.entity.VehiculoAutomovilBase;
import pe.com.arland.cliente1.registro.entity.VehiculoScooterBase;
import pe.com.arland.cliente1.registro.entity.factory.FabricaVehiculoElectricidad;
import pe.com.arland.cliente1.registro.entity.factory.FabricaVehiculoGasolina;
import pe.com.arland.cliente1.registro.entity.factory.IFabricaVehiculo;

public class App {
	
	 public static int nAutos = 3; 
	 public static int nScooters = 2; 
	  
    public String getGreeting() {
     	
    	//I-MARCA DE CONTROL 
    	System.out.println("=============================================");
     	System.out.println("====    INICIANDO EL PROGRAMA PRINCIPAL  ====");
     	System.out.println("=============================================");
     	//F-MARCA DE CONTROL 
     	
     	
     	//I-SECCION DE INSTANCIACION DE FABRICA 
        IFabricaVehiculo fabrica; 
       //F-SECCION DE INSTANCIACION DE FABRICA 
        
        //Lista de Articulos a comprar
        VehiculoAutomovilBase[] autos = new VehiculoAutomovilBase[nAutos]; 
        VehiculoScooterBase[] scooters = new VehiculoScooterBase[nScooters]; 

        
        //I- SECCION DE INTERACION DE INTERFASE 
        System.out.print("Desea utilizar " + 
          "vehiculos electricos (1) o a gasolina (2):");
        //Scanner reader = new Scanner(System.in); 
        //String eleccion = reader.next(); 
        String eleccion = "1"; 
        //F- SECCION DE INTERACION DE INTERFASE 
        
        //I- SECCION DE PROCESAMIENTO DE LA SELECCION
        if (eleccion.equals("1")){ 
          fabrica = new FabricaVehiculoElectricidad(); 
        } 
        else { 
          fabrica = new FabricaVehiculoGasolina(); 
        } 
        
        for (int index = 0; index < nAutos; index++) {
          autos[index] = fabrica.creaAutomovil("estandar","amarillo", 6+index, 3.2); 
        }
        
        for (int index = 0; index < nScooters; index++) { 
          scooters[index] = fabrica.creaScooter("clasico",  
            "rojo", 2+index); 
        }
        
        //F- SECCION DE PROCESAMIENTO DE LA SELECCION
        
        //I- SECCION DE VISTA RESULTADO DEL PROCESO
        for (VehiculoAutomovilBase auto: autos) { 
          auto.mostrarCaracteristicas(); 
        }
        
        for (VehiculoScooterBase scooter: scooters) { 
          scooter.mostrarCaracteristicas(); 
        }
        //F- SECCION DE VISTA RESULTADO DEL PROCESO
        // PRUEBAS UNITARIAS MANUALES
        
    	//I-MARCA DE CONTROL 
    	System.out.println("=============================================");
     	System.out.println("====    FINALIZANDO EL PROGRAMA PRINCIPAL  ====");
     	System.out.println("=============================================");
     	//F-MARCA DE CONTROL 
        
    	//I-PRUEBA UNITARIA MANUAL       	

     	
     	
    	//F-PRUEBA UNITARIA MANUAL       	
        return "Agun Saludo";
    }

    
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
