package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_17256 {
	public static void main(String[] args) throws IOException{
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] a = new int[3];
		int[] c = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		a[2] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		c[0] = Integer.parseInt(st.nextToken());
		c[1] = Integer.parseInt(st.nextToken());
		c[2] = Integer.parseInt(st.nextToken());
		
		bw.write((c[0] - a[2]) + " " + (c[1] / a[1]) + " " + (c[2] - a[0]));
		bw.flush();
	}
}