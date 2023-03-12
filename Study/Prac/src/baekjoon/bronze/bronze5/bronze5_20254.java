package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_20254 {
	public static void main(String[] args) throws IOException{
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long Ur = Long.parseLong(st.nextToken());
		long Tr = Long.parseLong(st.nextToken());
		long Uo = Long.parseLong(st.nextToken());
		long To = Long.parseLong(st.nextToken());
		
		long score = 56 * Ur + 24 * Tr + 14 * Uo + 6 * To;
		
		bw.write(score + "");
		bw.flush();
	}
}