package baekjoon.bronze.bronze4;

import java.util.Scanner;

public class bronze4_2480 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = 0;
        
        if(A==B && A==C){
            D = 10000 + (A * 1000);
        }else if(A==B || A==C){
            D = 1000 + (A * 100);
        }else if(B==C){
            D = 1000 + (B * 100);
        }else{
            if(B<A && C<A){
                D = A * 100;
            }else if(A<B && C<B){
                D = B * 100;
            }else{
                D = C * 100;
            }
        }
        System.out.print(D);
	}
}
