package baekjoon.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ch07_1_2738 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[][] arr = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        
        for(int i=0; i<arr.length; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0; j<arr[i].length; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        for(int i=0; i<arr.length; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0; j<arr[i].length; j++) {
        		arr[i][j] += Integer.parseInt(st.nextToken());
        		bw.write("" + arr[i][j] + " ");
        	}
        	bw.newLine();
        }
        bw.flush();
	}
}
