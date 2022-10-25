package menuForStudents;

import java.math.BigInteger;

public class Factorial {
	public  BigInteger factorial(int num) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= num; i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}
