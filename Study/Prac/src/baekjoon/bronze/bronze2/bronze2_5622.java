package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze2_5622 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("");
        int sec = 0;
        
        for(int i=0; i<str.length; i++) {
        	if(str[i].equals("A") || str[i].equals("B") || str[i].equals("C")) {
        		sec += 3;
        	}else if(str[i].equals("D") || str[i].equals("E") || str[i].equals("F")) {
        		sec += 4;
        	}else if(str[i].equals("G") || str[i].equals("H") || str[i].equals("I")) {
        		sec += 5;
        	}else if(str[i].equals("J") || str[i].equals("K") || str[i].equals("L")) {
        		sec += 6;
        	}else if(str[i].equals("M") || str[i].equals("N") || str[i].equals("O")) {
        		sec += 7;
        	}else if(str[i].equals("P") || str[i].equals("Q") || str[i].equals("R") || str[i].equals("S")) {
        		sec += 8;
        	}else if(str[i].equals("T") || str[i].equals("U") || str[i].equals("V")) {
        		sec += 9;
        	}else{
        		sec += 10;
        	}
        }
        
        bw.write("" + sec);
        bw.flush();
    }
}
