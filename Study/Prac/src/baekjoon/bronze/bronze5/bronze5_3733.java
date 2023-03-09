package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_3733 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int persons;
        long s;
        try {
			while(true) {
				st = new StringTokenizer(br.readLine());
				persons = Integer.parseInt(st.nextToken()) + 1;
				s = Long.parseLong(st.nextToken());
				bw.write(s / persons + "");
				bw.newLine();
			}
		} catch (Exception e) {
			bw.flush();
		}
	}
}
