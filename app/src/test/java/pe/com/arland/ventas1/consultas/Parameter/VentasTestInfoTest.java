package pe.com.arland.ventas1.consultas.Parameter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class VentasTestInfoTest {

    @BeforeEach
    void init(TestInfo testInfo) {
    	System.out.println("**********************************");
    	System.out.println(">> Se esta ejecutando BEFORE EACH");
        String displayName = testInfo.getDisplayName();
        System.out.printf("@BeforeEach %s %n", displayName);
        System.out.println("**********************************");
    }

    @Tag("Este_TAG1")
    @Tag("Este_TAG2")
    @Test
    @DisplayName("ESTE ES EL TEST 1")
    void testOne(TestInfo testInfo) {
    	
    	System.out.println(">> INICIO TEST 1");
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(">> FINAL TEST 1");
    }

    @DisplayName("ESTE ES EL TEST 2")
    @Test
    void testTwo() {
    	System.out.println(">> INICIO TEST 2");
        System.out.println(">> FINAL TEST 2");
    }

}


