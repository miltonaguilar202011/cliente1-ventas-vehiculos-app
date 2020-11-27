package pe.com.arland.ventas1.consultas.factory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

class VentasCollectionTestFactoryStreamExampleTest {

	@TestFactory
	    Stream<DynamicTest> streamTest() {
	        // Input data
	        Integer array[] = { 1, 2, 3 };
	        Iterator<Integer> inputGenerator = Arrays.asList(array).iterator();

	        // Display names
	        Function<Integer, String> displayNameGenerator = (input) -> "Data input:" + input;

	        // Test executor
	        ThrowingConsumer<Integer> testExecutor = (input) -> {
	            System.out.println(input);
	            assertTrue(input % 2 == 0);
	        };

	        // Returns a stream of dynamic tests
	        return stream(inputGenerator, displayNameGenerator, testExecutor);
	    }

}
