package pe.com.arland.ventas1.consultas.factory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class VentasCollectionTestFactoryInputStream {

	  @TestFactory
	    Stream<DynamicTest> dynamicTestsFromStream() {
	        Stream<String> inputStream = Stream.of("A", "B", "C");
	        return inputStream.map(input ->
	        		dynamicTest("Display name for input " + input,() -> {System.out.println("Testing " + input);}
	        		)
	        );
	    }
}
