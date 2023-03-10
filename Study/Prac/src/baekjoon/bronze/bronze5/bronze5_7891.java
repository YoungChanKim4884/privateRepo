package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_7891 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++) {
        	st = new StringTokenizer(br.readLine());
        	bw.write(Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + "");
        	bw.newLine();
        }
        bw.flush();
	}
}
