package baekjoon.ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ch05_11_11718 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
        	while(true) {
        		bw.write(br.readLine());
        		bw.newLine();
            }
		} catch (Exception e) {
			
		}
        bw.flush();
    }
}
