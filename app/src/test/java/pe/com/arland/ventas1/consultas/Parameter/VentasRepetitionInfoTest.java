package pe.com.arland.ventas1.consultas.Parameter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class VentasRepetitionInfoTest {
	    @RepeatedTest(2)
	    void test(RepetitionInfo repetitionInfo) {
	        System.out.println("** Test " + 
	            repetitionInfo.getCurrentRepetition()
	            + "/" + repetitionInfo.getTotalRepetitions());
	    }
}
