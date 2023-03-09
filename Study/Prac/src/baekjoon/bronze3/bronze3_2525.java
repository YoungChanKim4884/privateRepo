package baekjoon.bronze3;

import java.util.Scanner;

public class bronze3_2525 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if(A<0 || 23<A){
            System.out.print("시간은 0~23 사이를 입력해주세요.");
        }else if(B<0 || 59<B){
            System.out.print("분은 0~59 사이를 입력해주세요.");
        }else if(C<0 || 1000<C) {
        	System.out.println("조리시간은 0~1000사이 값을 입력해주세요.");
        }
        
        int D = C / 60;
        int E = C % 60;
        
        B = B + E;
        A = A + D;
        if(B>59){
            B = B - 60;
            A = A + 1;
        }
        
        if(A>23){
            A = A - 24;
        }

        System.out.print(A + " " + B);
	}
}
