package baekjoon.ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ch05_7_1157 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().toLowerCase();
        
        int[] alphabet = new int[26];
        for(int i=0; i<alphabet.length; i++) {
        	alphabet[i] = 0;
        }
        
        for(int i=0; i<str.length(); i++) {
    		alphabet[str.charAt(i) - 97]++;
        }
        String max = "0";
        char ch = ' ';
        for(int i=0; i<alphabet.length; i++) {
        	if(Integer.parseInt(max)<alphabet[i]) {
        		max = "" + alphabet[i];
        		ch = (char)(i + 'A');
        	}
        }
        int cnt = 0;
        for(int i=0; i<alphabet.length; i++) {
        	if(Integer.parseInt(max)==alphabet[i]) {
        		cnt++;
        		if(cnt>1) {
        			max = "?";
            		break;
        		}
        	}
        }
        if(cnt==1) {
        	max = "" + ch;
        }
        bw.write(max);
        bw.flush();
    }
}
