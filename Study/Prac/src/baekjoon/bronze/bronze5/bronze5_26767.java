package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_26767 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		long V = N / 5;
		int I = (int)N % 5;
		
		for(int i=0; i<V; i++) {
			bw.write("V");
		}
		for(int i=0; i<I; i++) {
			bw.write("I");
		}
		bw.flush();
	}
}