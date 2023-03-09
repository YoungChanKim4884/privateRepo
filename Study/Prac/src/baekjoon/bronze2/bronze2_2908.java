package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze2_2908 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().trim().split(" ");
        
        String tmp = "";
        for(int i=0; i<str.length; i++) {
        	for(int j=str[i].length()-1; j>=0; j--) {
        		tmp += "" + str[i].charAt(j);
        		
        	}
        	str[i] = tmp;
        	tmp = "";
        }
        
        if(Integer.parseInt(str[0])>Integer.parseInt(str[1])) {
        	bw.write(str[0]);
        }else {
        	bw.write(str[1]);
        }
        bw.flush();
    }
}
