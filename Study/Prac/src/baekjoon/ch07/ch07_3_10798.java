package baekjoon.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ch07_3_10798 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();
        
        String str = "";
        
        for(int i=0; i<15; i++) {
        	if(i<str1.length()) {
        		str += str1.charAt(i);
        	}
        	if(i<str2.length()) {
        		str += str2.charAt(i);
        	}
        	if(i<str3.length()) {
        		str += str3.charAt(i);
        	}
        	if(i<str4.length()) {
        		str += str4.charAt(i);
        	}
        	if(i<str5.length()) {
        		str += str5.charAt(i);
        	}
        	if(i>=str1.length() && i>=str2.length() && i>=str3.length() && i>=str4.length() && i>=str5.length()) {
        		break;
        	}
        }
        
        bw.write(str);
        bw.flush();
	}
}