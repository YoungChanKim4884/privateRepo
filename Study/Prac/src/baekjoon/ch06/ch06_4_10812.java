package baekjoon.ch06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ch06_4_10812 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] num = new int[Integer.parseInt(st.nextToken())];
        for(int i=0; i<num.length; i++) {
        	num[i] = i + 1;
        }
        
        int leng = Integer.parseInt(st.nextToken());
        int begin, mid, end, tmp, cnt;

        for(int i=0; i<leng; i++) {
        	st = new StringTokenizer(br.readLine());
        	begin = Integer.parseInt(st.nextToken()) - 1;
        	cnt = begin;
        	end = Integer.parseInt(st.nextToken()) - 1;
        	mid = Integer.parseInt(st.nextToken()) - 1;
        	while(true) {
        		if(cnt==mid) {
        			break;
        		}
        		for(int j=begin; j<end; j++) {
            		tmp = num[j];
            		num[j] = num[j + 1];
            		num[j + 1] = tmp;
            	}
        		cnt++;
        	}
        }
        for(int i=0; i<num.length; i++) {
        	bw.write(num[i] + " ");
        }
        bw.flush();
	}
}
