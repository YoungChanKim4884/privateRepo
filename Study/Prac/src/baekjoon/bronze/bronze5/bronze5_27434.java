package baekjoon.bronze.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class bronze5_27434 {
	private static final int SIMPLE_THRESHOLD = 10;
	private static BigInteger fac6(int n) {
	    return subfac(1, n);
	}
	private static BigInteger subfac(int a, int b) {
	    if ((b-a) < SIMPLE_THRESHOLD) {
	        BigInteger result = BigInteger.ONE;
	        for (int i=a; i<=b; i++) {
	            result = result.multiply(BigInteger.valueOf(i));
	        }
	        return result;
	    } else {
	        int mid = a + (b-a) / 2;
	        return subfac(a, mid).multiply(subfac(mid+1, b));
	    }

	}

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    int n = in.nextInt();
	    System.out.printf("%d%n", fac6(n));
	}
}