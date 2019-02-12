package factorial.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	private Factorial factorial;

	@Before
	public void setup() {
		factorial = new Factorial();
	}

	@Test
	public void testFactorialOf0() {
		assertEquals(1, factorial.compute(0));
	}

}
