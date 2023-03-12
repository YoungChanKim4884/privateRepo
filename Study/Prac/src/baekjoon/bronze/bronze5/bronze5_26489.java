package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_26489 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0;
		try {
			while(true) {
				if(br.readLine().equals("gum gum for jay jay")) {
					cnt++;
				}else {
					break;
				}
			}
		} catch (Exception e) {
			
		}
		bw.write(cnt + "");
		bw.flush();
	}
}