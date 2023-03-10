package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_10872 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int leng = Integer.parseInt(br.readLine());
		long N = 1;
		
		for(int i=1; i<=leng; i++) {
			N *= i;
		}
		if(leng==0) {
			N = 1;
		}
        bw.write(N + "");
        bw.flush();
		
	}
}