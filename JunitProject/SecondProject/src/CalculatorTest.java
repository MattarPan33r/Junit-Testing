import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator;
	
	/*** Initialization ***/
	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}
	
	/*** Test cases ***/
	@Test
	public void testAddition() {
		double expected = 7.2;
		double result = calculator.add(2.0, 5.2);
		Assertions.assertEquals(expected, result);
	}
	@Test
	public void testSubtraction() {
		double expected = 3.5;
		double result = calculator.subtract(8.5, 5.0);
		Assertions.assertEquals(expected, result);
	}
	@Test
	public void testMultiplication() {
		double expected = 42.5;
		double result = calculator.multiplication(8.5, 5.0);
		Assertions.assertEquals(expected, result);
	}
	@Test
	public void testDivision() {
		double expected = 2.0;
		double result = Calculator.division(8.4, 4.2);
		Assertions.assertEquals(expected, result);
	}
	
	@Test
	public void testPower() {
		double expected = 8.0;
		double result = Calculator.power(2.0, 3.0);
		Assertions.assertEquals(expected, result);
	}
	@Test
	public void Squareroot() {
		double expected = 7.0;
		double result = Calculator.squareroot(49.0);
		Assertions.assertEquals(expected, result);
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
}