package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_21300 {
	public static void main(String[] args) throws IOException{
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		for(int i=0; i<6; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		bw.write(sum * 5 + " ");
		bw.flush();
	}
}