package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_24736 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int T, F, S, P, C;
		int away, home;
		for(int i=0; i<2; i++) {
			st = new StringTokenizer(br.readLine());
			
			T = Integer.parseInt(st.nextToken());
			F = Integer.parseInt(st.nextToken());
			S = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			if(i==0) {
				away = T * 6 + F * 3 + S * 2 + P * 1 + C * 2;
				bw.write(away + " ");
			}else {
				home = T * 6 + F * 3 + S * 2 + P * 1 + C * 2;
				bw.write("" + home);
			}
		}
		
		bw.flush();
	}
}