package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze2_10988 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String palindrome = "0";
        String str = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        
        if(str.equals(reversedStr)) {
        	palindrome = "1";
        }
        bw.write(palindrome);
        bw.flush();
	}
}
