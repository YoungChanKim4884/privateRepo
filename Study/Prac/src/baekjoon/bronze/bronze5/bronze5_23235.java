package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_23235 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = 1;
		while(true) {
			if(br.readLine().equals("0")) {
				break;
			}
			bw.write("Case " + i + ": Sorting... done!");
			bw.newLine();
			i++;
		}
		bw.flush();
	}
}