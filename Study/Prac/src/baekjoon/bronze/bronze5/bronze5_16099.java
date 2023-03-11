package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze5_16099 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=testCase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			long lt = Long.parseLong(st.nextToken());
			long wt = Long.parseLong(st.nextToken());
			long le = Long.parseLong(st.nextToken());
			long we = Long.parseLong(st.nextToken());
			
			if(lt * wt > le * we) {
				bw.write("TelecomParisTech");
			}else if(lt * wt < le * we) {
				bw.write("Eurecom");
			}else {
				bw.write("Tie");
			}
			bw.newLine();
		}
		bw.flush();
	}
}