package zad02;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Test(timeout=100)
	public void calculatorTestAdd(){
		assertEquals(5,calculator.add(1.23, 3.77), 0.0001);
	}
	@Test(timeout=100)
	public void calculatorTestSub(){
		assertEquals(3,calculator.sub(3.14, 0.14), 0.0001);
	}
	@Test(timeout=100)
	public void calculatorTestMulti(){
		assertEquals(4.41,calculator.multi(2.1, 2.10001), 0.0001);
		assertNotEquals(4.41,calculator.multi(2.1, 2.10001), 0.00001);
		assertEquals(-10, calculator.multi(2.5, -4.0), 0.001);
	}
	
	@Test(timeout=100)
	public void calculatorTestDiv(){
		assertEquals(4.319672131, calculator.div(5.27, 1.22),0.000000001);
	}
	
	@Test(timeout=100)
	public void calculatorTestGreater(){
		assertTrue(calculator.greater(3.000001,3.0000001));
	}
	

}
