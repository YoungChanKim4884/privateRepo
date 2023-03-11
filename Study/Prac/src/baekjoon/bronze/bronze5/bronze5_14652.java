package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_14652 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		long d = 0;
        boolean e = false;
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				if(d==c) {
					bw.write(i + " " + j);
                    e = true;
                    break;
				}
				d++;
			}
            if(e) {
                break;
            }
		}
		bw.flush();
	}
}