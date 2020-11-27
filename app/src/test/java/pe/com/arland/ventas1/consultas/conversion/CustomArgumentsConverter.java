package pe.com.arland.ventas1.consultas.conversion;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class CustomArgumentsConverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) {
          return String.valueOf(source);
    }
}