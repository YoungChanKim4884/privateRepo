package ch03;

import java.util.Scanner;

public class ch03_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        int a, b;
        int sum = 0;
        
        for(int i=1; i<=N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            sum = sum + (a * b);
        }
        
        if(sum==X){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}