package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_2475{
    public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		try {
			while(true) {
				sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
			}
		} catch (Exception e) {
			
		}
		
		bw.write(sum % 10 + "");
		bw.flush();
    }
}
