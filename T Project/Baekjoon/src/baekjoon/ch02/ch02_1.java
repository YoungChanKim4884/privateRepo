package baekjoon.ch02;

import java.util.Scanner;

public class ch02_1 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int A = sc.nextInt();
	    int B = sc.nextInt();
	    
	    if(A > B){
	        System.out.print(">");
	    }else if(A < B){
	        System.out.print("<");
	    }else{
	        System.out.print("==");
	    }
	}
}
