package baekjoon.bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze4_11720 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int leng = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] str = br.readLine().split("");
        
        for(int i=0; i<leng; i++) {
        	sum += Integer.parseInt(str[i]);
        }
        
        bw.write("" + sum);
        bw.flush();
    }
}
