package baekjoon.ch02;

import java.util.Scanner;

public class ch02_3_2753 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if((A%400)==0){
		    System.out.print("1");
		}else if(A%4==0){
		    if(A%100!=0){
		        System.out.print("1");
		    }else{
		        System.out.print("0");
		    }
		}else {
			System.out.print("0");
		}
	}
}
