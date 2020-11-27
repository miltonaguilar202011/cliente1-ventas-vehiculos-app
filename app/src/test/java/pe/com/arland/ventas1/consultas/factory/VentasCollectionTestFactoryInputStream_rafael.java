package pe.com.arland.ventas1.consultas.factory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class VentasCollectionTestFactoryInputStream_rafael {

//	  @TestFactory
//	    Stream<DynamicTest> dynamicTestsFromStream() {
//	        Stream<String> inputStream = Stream.of("A", "B", "C");
//	        return inputStream.map(input ->
//	        		dynamicTest("Display name for input " + input,() -> {System.out.println("Testing " + input);}
//	        		)
//	        );
//	    }
//	  
	  
	  
	  @TestFactory
	    Collection<DynamicTest> dynamicTests() {
	        return Arrays.asList(
	            dynamicTest("simple dynamic test", () -> assertTrue(true)),
	            dynamicTest("My Executable Class", new MyExecutable()),
	            dynamicTest("Exception Executable", () -> {throw new Exception("Exception Example");}),
	            dynamicTest("simple dynamic test-2", () -> assertTrue(true))
	        );
	    }
	  
	  class MyExecutable implements Executable {

			public void execute() throws Throwable {
				System.out.println("Hello World!");
			}

		}
	  

//@TestFactory
//Stream<DynamicTest> dynamicTestsExample() {
//	List<Integer> input1List = Arrays.asList(1,2,3);
//	List<Integer> input2List = Arrays.asList(10,20,30);
//	
//	List<DynamicTest> dynamicTests = new ArrayList<>();
//	
//	for(int i=0; i < input1List.size(); i++) {
//		int x = input1List.get(i);
//		int y = input2List.get(i);
//		DynamicTest dynamicTest = dynamicTest("Dynamic Test for MyUtils.add("+x+","+y+")", () ->{assertEquals(x+y,MyUtils.add(x,y));});
//		dynamicTests.add(dynamicTest);
//	}
//	
//	return dynamicTests.stream();
	  
//	  @TestFactory
//	    Collection<DynamicTest> dynamicTestsFromCollection() {
//	    
//	        return Arrays.asList(
////	            dynamicTest("1st dynamic test", () -> assertTrue(MathUtil. isPrime(13))),
//	            dynamicTest("2nd dynamic test", () -> assertEquals(5, MathUtil.divide(25, 5)))
//	        );
//	    }
//	  // Static test 2
//	  @Test
//	  void test_Devide() {
//	    assertEquals(5, MathUtil.divide(25, 5));
//	  }
}


