package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_26307 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int HH = Integer.parseInt(st.nextToken());
		int MM = Integer.parseInt(st.nextToken());
		
		if(HH==9 && MM==0) {
			bw.write("0");
		}else {
			bw.write((HH - 9) * 60 + MM + "");
		}
		
		bw.flush();
	}
}