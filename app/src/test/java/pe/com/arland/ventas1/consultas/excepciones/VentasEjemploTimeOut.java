package pe.com.arland.ventas1.consultas.excepciones;

import static org.junit.jupiter.api.Assertions.*;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import org.junit.jupiter.api.Test;
class VentasEjemploTimeOut {
	@Test
	void tiempoNoExedido() 
	{
	    //La siguiente assert no falla
	    assertTimeout(ofMinutes(1), () -> {
	        // Ejecuta una tarea que ejecuta menos de 1 minuto.
	    	tareaEjecucion();
	    });
	}
	@Test
	void tiempoExedido() 
	{
	    //La siguiente assert falla com um mensaje similar a :
	    // execution exceded timeout of 1000 ms by 2000 ms
	    assertTimeout(ofMillis(1000), () -> {
	        // jecuta una tarea que ejecuta menos de 1 minuto
	    	tareaEjecucion();
	    });
	}
	//La siguiente tarea toma 3 segundos
	void tareaEjecucion() throws InterruptedException {
		Thread.sleep(3000);
	}
}
