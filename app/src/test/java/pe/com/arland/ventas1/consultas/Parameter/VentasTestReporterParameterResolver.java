package pe.com.arland.ventas1.consultas.Parameter;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

class VentasTestReporterParameterResolver {

    @Test
    void reportSingleValue(TestReporter testReporter) {
        testReporter.publishEntry("key", "value");
    }

    @Test
    void reportSeveralValues(TestReporter testReporter) {
        HashMap<String, String> values = new HashMap<>();
        values.put("name", "john");
        values.put("surname", "doe");
        testReporter.publishEntry(values);
    }

}