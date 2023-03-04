package baekjoon.ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ch05_6_2675 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int leng;
        String str;
        
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
        	st = new StringTokenizer(br.readLine());
        	leng = Integer.parseInt(st.nextToken());
        	str = st.nextToken();
        	for(int j=0; j<str.length(); j++) {
        		for(int k=0; k<leng; k++) {
        			bw.write(str.charAt(j) + "");
        		}
        	}
        	bw.newLine();
        }
        bw.flush();
    }
}
