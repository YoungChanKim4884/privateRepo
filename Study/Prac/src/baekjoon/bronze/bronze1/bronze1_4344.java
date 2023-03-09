package baekjoon.bronze.bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze1_4344 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int C = Integer.parseInt(br.readLine());
        int N, cnt = 0;
        double sum = 0, avg, result;
        
        for(int i=1; i<=C; i++) {
        	st = new StringTokenizer(br.readLine());
        	N = Integer.parseInt(st.nextToken());
        	int[] score = new int[N];
        	for(int j=0; j<N; j++) {
        		score[j] = Integer.parseInt(st.nextToken());
        		sum += score[j];
        	}
        	avg = (double)sum / N;
        	for(int j=0; j<N; j++) {
        		if(avg<score[j]) {
        			cnt++;
        		}
        	}
        	result = (double)cnt / N * 100;
        	bw.write(String.format("%.3f", result) + "%");
        	bw.newLine();
        	cnt = 0;
        	sum = 0; 
        }
        bw.flush();
	}
}
