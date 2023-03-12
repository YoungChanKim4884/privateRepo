package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_18301 {
	public static void main(String[] args) throws IOException{
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double n1 = Double.parseDouble(st.nextToken());
		double n2 = Double.parseDouble(st.nextToken());
		double n12 = Double.parseDouble(st.nextToken());
		double N = (((n1 + 1) * (n2 + 1))/(n12 + 1)) - 1;
		int T = (int)N;
		
		bw.write(T + "");
		bw.flush();
	}
}