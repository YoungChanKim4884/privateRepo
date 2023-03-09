package baekjoon.bronze5;

import java.util.Scanner;

public class bronze5_5597 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student[] = new int[30];
        for(int i=0; i<28; i++){
            student[sc.nextInt()-1]++;
        }
        for(int i=0; i<30; i++){
            if(student[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
