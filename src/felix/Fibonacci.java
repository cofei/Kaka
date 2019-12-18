package felix;

import java.math.*;

public class Fibonacci {
	private BigInteger fibnum;		// the final Fibonacci number;
	private BigInteger pfib;		// previous Fibonacci number;
	private BigInteger ppfib;		// previous previous Fibonacci number;
	
	public BigInteger Sequence(int inNum) {
		ppfib = BigInteger.valueOf(1);
		pfib = BigInteger.valueOf(1);
		
		if (inNum <= 2) {
			fibnum = BigInteger.valueOf(1);
		} else {
			for (int i = 3; i <= inNum; i++) {
				fibnum = pfib.add(ppfib);
				ppfib = pfib;
				pfib = fibnum;
			}
		}
		
		 System.out.println("Fibonacci Series of "+inNum+" numbers: " + fibnum);
		return fibnum;
		
	}
	
}
