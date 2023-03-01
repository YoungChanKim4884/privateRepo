package baekjoon.ch02;

import java.util.Scanner;

public class ch02_5_2884 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(H<0 || 23<H){
            System.out.print("시간은 0~23 사이를 입력해주세요.");
        }else if(M<0 || 59<M){
            System.out.print("분은 0~59 사이를 입력해주세요.");
        }
        
        M = M - 45;
        if(M<0){
            M = M + 60;
            H = H - 1;
            
            if(H<0){
                H = H + 24;
            }
        }
        System.out.print(H + " " + M);
	}
}
