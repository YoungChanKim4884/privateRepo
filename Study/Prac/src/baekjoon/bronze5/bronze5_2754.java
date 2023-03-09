package baekjoon.bronze5;

import java.util.Scanner;

public class bronze5_2754 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] grade = sc.next().split("");
		float num = 0;
		
		if(grade[0].equals("A")) {
			num = 4.0f;
		}else if(grade[0].equals("B")){
			num = 3.0f;
		}else if(grade[0].equals("C")){
			num = 2.0f;
		}else if(grade[0].equals("D")){
			num = 1.0f;
		}else{
			num = 0.0f;
		}
		
		try {
			if(grade[1].equals("+")) {
				num += 0.3f;
			}else if(grade[1].equals("-")){
				num -= 0.3f;
			}
		} catch (Exception e) {
			
		}
		
		System.out.print(num);
	}
}
