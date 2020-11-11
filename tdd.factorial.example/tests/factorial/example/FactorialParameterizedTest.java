package factorial.example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FactorialParameterizedTest {

	@Parameters(name = "{index}: factorial({0})={1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(
			new Object[][] {
				{ 0, 1 },
				{ 1, 1 },
				{ 2, 2 },
				{ 3, 6 },
				{ 4, 24 },
			});
	}

	private Factorial factorial;
	private int input;
	private int expected;

	public FactorialParameterizedTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
		factorial = new Factorial();
	}

	@Test
	public void testFactorial() {
		assertEquals(expected, factorial.compute(input));
	}

	// unfortunately, this is executed over and over again for each
	// { input, expected }
	@Test
	public void testNegativeInput() {
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
			() -> factorial.compute(-1));
		assertEquals("Negative input: -1", thrown.getMessage());
	}
}
