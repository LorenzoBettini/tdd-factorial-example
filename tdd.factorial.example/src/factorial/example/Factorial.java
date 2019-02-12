package factorial.example;

public class Factorial {

	public int compute(int n) {
		if (n < 2)
			return 1;
		return n * compute(n - 1);
	}

}
