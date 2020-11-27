package pe.com.arland.ventas1.consultas.interfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInterfaceTest implements TestLifecycleLogger, 
TestInterfaceDynamicTestsDemo {

@Test
void isEqualValue() {
assertEquals(1, 1);
}

}
