package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_20492 {
	public static void main(String[] args) throws IOException{
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Integer.parseInt(br.readLine());
		
		long answer1 = (int)(N * 0.78);
		long answer2 = (int)((N * 0.8) + (N * 0.2 * 0.78));
		
		bw.write(answer1 + " " + answer2);
		bw.flush();
	}
}