package baekjoon.bronze.bronze5;

import java.util.Scanner;

public class bronze5_2744 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String changeStr = "";
        for(int i=0; i<str.length(); i++) {
        	if(97<=str.charAt(i) && str.charAt(i)<=122) {
        		changeStr += (char)(str.charAt(i) - 32);
        	}else {
        		changeStr += (char)(str.charAt(i) + 32);
        	}
        }
        System.out.print(changeStr);
    }
}