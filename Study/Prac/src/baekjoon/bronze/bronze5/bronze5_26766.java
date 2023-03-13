package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze5_26766 {
	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		
		for(int i=0; i<N; i++) {
			bw.write(" @@@   @@@ ");
			bw.newLine();
			bw.write("@   @ @   @");
			bw.newLine();
			bw.write("@    @    @");
			bw.newLine();
			bw.write("@         @");
			bw.newLine();
			bw.write(" @       @ ");
			bw.newLine();
			bw.write("  @     @  ");
			bw.newLine();
			bw.write("   @   @   ");
			bw.newLine();
			bw.write("    @ @    ");
			bw.newLine();
			bw.write("     @     ");
			bw.newLine();
		}
		bw.flush();
	}
}