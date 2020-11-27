package pe.com.arland.ventas1.consultas.parametrized;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValueSourceStringsParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = { "Hello", "World" })
    void testWithStrings(String argument) {
      System.out.println("Parameterized test with (String) parameter:  "             
        + argument);
      assertNotNull(argument);
    }
}