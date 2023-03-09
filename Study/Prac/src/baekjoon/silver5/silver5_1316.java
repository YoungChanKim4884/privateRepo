package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class silver5_1316 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        for(int i=0; i<N; i++) {
        	String str = br.readLine();
        	if(str.length()==1) {
        		continue;
        	}
        	
        	for(int j=0; j<str.length(); j++) {
        		for(int k=j+1; k<str.length(); k++) {
        			if(str.charAt(j)==str.charAt(k)) {
        				for(int l=j; l<k; l++) {
        					if(str.charAt(j)!=str.charAt(l)) {
        						cnt1++;
        						break;
        					}
        				}
        			}
        			if(cnt1!=0) {
        				break;
        			}
        		}
        		if(cnt1!=0) {
        			cnt2++;
        			cnt1 = 0;
    				continue;
    			}
        	}
        	if(cnt2!=0) {
        		cnt3++;
        		cnt2 = 0;
        	}
        }
        bw.write(N-cnt3 + "");
        bw.flush();
	}
}
