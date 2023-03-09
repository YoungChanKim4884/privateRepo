package baekjoon.bronze.bronze5;

import java.util.Scanner;

public class bronze5_8393{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = 0;
        for(int i=1; i<=A; i++){
            B = B + i;
        }
        
        System.out.print(B);
    }
}