package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_5341 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}
			int sum = 0;
			for(int i=1; i<=N; i++) {
				
				sum += i;
			}
			
			bw.write(sum + "");
			bw.newLine();
		}
        bw.flush();
	}
}