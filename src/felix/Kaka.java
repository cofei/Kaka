package felix;

import java.math.*;

public class Kaka {

	public static void main(String[] args) {
		int num = 20;
		BigInteger fibnum;
		
		Fibonacci fib = new Fibonacci();
		BizzBuzz bb = new BizzBuzz(3, 5, fib.Sequence(num));

		for (int c = 1; c <= 20; c ++) {
			fibnum = fib.Sequence(c);
			bb.Execute(fibnum);
		}

	}

}
