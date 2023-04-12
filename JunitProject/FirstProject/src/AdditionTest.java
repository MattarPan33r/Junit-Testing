import org.junit.After;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdditionTest {
	private Addition addition;

	/*** Initialization ***/
	@BeforeEach
	public void setUp() {
		addition = new Addition();
	}

	/*** Test case for add method ***/
	@Test
	public void testAddition() {
		int result = 40;
		int expected = addition.add(10, 30);
		Assertions.assertEquals(result, expected);
	}

	/*** destroy the object ***/
	@After
	public void tearDown() {
		addition = null;
	}
}