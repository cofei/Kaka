package felix;

import java.math.*;

public class BizzBuzz {

	private int bizzNum;
	private int buzzNum;
	private BigInteger lastNum;
	
	BizzBuzz(int inbizz, int inbuzz, BigInteger inlast)
	{
		bizzNum = inbizz;
		buzzNum = inbuzz;
		lastNum = inlast;
	}
	public void Execute(BigInteger bigNum) {
		if (bigNum.mod(BigInteger.valueOf(bizzNum)) == BigInteger.valueOf(0)
				&& bigNum.mod(BigInteger.valueOf(buzzNum)) == BigInteger.valueOf(0))
		{
			System.out.print("BizzBuzz");
		} else if (bigNum.mod(BigInteger.valueOf(bizzNum)) == BigInteger.valueOf(0)) {
			System.out.print("Bizz");
		} else if (bigNum.mod(BigInteger.valueOf(buzzNum)) == BigInteger.valueOf(0)) {
			System.out.print("Buzz");
		} else {
			System.out.print(bigNum);
		} 
		
		if (bigNum.equals(lastNum))
		{
			System.out.print("");
		} else {
			System.out.print(", ");
		}
	}
}
