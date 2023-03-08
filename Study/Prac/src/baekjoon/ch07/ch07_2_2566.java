package baekjoon.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ch07_2_2566 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int max = -1;
        int row = 0, column = 0;
        int num = 0;
        for(int i=1; i<10; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=1; j<10; j++) {
        		num = Integer.parseInt(st.nextToken());
        		if(max < num) {
        			max = num;
        			row = i;
        			column = j;
        		}
        	}
        }
        bw.write(max + "");
        bw.newLine();
        bw.write(row + " " + column);
        bw.flush();
	}
}
