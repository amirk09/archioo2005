package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import calculatrice.CalculatorConfig;
import calculatrice.MonException;
import calculatrice.Operator;

public class MultiplicationTest {
	@Before
	public void initConf() {
		CalculatorConfig.init();
	}
	@Test
	void test() throws MonException {
		assertEquals(5,Operator.execute(3, 2, '+'));
	}

}
