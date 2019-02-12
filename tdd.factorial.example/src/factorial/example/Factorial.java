package factorial.example;

public class Factorial {

	public int compute(int n) {
		if (n < 2)
			return 1;
		return n * (n - 1) * (n - 2);
	}

}
