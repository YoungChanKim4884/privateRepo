package ch03;

import java.util.Scanner;

public class ch03_3{
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