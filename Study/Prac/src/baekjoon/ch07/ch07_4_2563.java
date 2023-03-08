package baekjoon.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ch07_4_2563 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[][] arr = new int[100][100];
        int leng = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        int x, y;
        for(int i=0; i<leng; i++) {
        	st = new StringTokenizer(br.readLine());
        	x = Integer.parseInt(st.nextToken());
        	y = Integer.parseInt(st.nextToken());
        	for(int j=x; j<x+10; j++) {
        		for(int k=y; k<y+10; k++) {
        			arr[j][k] = 1;
        		}
        	}
        }
        int cnt = 0;
        for(int i=0; i<100; i++) {
        	for(int j=0; j<100; j++) {
        		if(arr[i][j]==1) {
        			cnt++;
        		}
        	}
        }
        bw.write("" + cnt);
        bw.flush();
	}
}