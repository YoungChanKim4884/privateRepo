package ch01;

import java.util.Scanner;

public class ch03_11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = B % 10;
		int D = (B % 100) / 10;
		int E = B / 100;
		
		System.out.println(A * C);
		System.out.println(A * D);
		System.out.println(A * E);
		System.out.println(A * B);


	}
}
