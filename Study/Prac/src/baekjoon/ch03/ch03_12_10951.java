package baekjoon.ch03;

import java.util.Scanner;

public class ch03_12_10951{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);
            }catch(Exception e){
                break;
            }
        }
    }
}
