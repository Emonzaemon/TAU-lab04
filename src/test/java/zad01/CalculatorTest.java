package zad01;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	public void calculatorTestAdd(){
		assertEquals(4,calculator.add(1, 3));
	}
	@Test
	public void calculatorTestSub(){
		assertEquals(3,calculator.sub(6, 3));
	}
	@Test
	public void calculatorTestMulti(){
		assertEquals(10,calculator.multi(2, 5));
	}
	@Test
	public void calculatorTestDiv(){
		assertEquals(5,calculator.div(10, 2));
	}
	@Test
	public void calculatorTestGreater(){
		assertTrue(calculator.greater(3, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideZero() {
		calculator.div(10, 0);
	}
	
	
}
