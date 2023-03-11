package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_14928 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String N = br.readLine();
		long remainder = 0;
		
        for (int i = 0; i<N.length(); i++) {
        	remainder *= 10;
        	remainder += (N.charAt(i) - '0');
        	remainder %= 20000303;
        }
        
		bw.write(remainder + "");
		bw.flush();
	}
}