package baekjoon.bronze.bronze5;

import java.util.Scanner;

public class bronze5_25314{
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        N /= 4;
        for(int i=1; i<=N; i++){
            System.out.print("long ");
        }
        System.out.print("int");
        
    }
}