package baekjoon.bronze.bronze1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze1_1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] N = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0.0;
        double sum = 0;
        
        for(int i=0; i<N.length; i++) {
        	N[i] = Integer.parseInt(st.nextToken());
        	if(N[i]>max) {
        		max = N[i];
        	}
        }
        
        for(int i=0; i<N.length; i++) {
        	sum += N[i] / max * 100;
        }
        
        bw.write(sum / N.length + " ");
        bw.flush();
    }
}
