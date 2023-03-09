package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_4101 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        long num1, num2;
        
		while(true) {
			st = new StringTokenizer(br.readLine());
			num1 = Long.parseLong(st.nextToken());
			num2 = Long.parseLong(st.nextToken());
			if(num1==0 && num2==0) {
				break;
			}else {
				if(num1>num2) {
					bw.write("Yes");
				}else {
					bw.write("No");
				}
			}
			bw.newLine();
		}

        bw.flush();
	}
}
