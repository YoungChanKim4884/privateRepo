package baekjoon.ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ch05_8_1152 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().trim().split(" ");
        
        if(str[0].equals("")) {
        	bw.write("0");
        }else {
        	bw.write("" + str.length);
        }
        bw.flush();
    }
}
