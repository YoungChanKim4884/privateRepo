package baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class bronze5_1271 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger money = new BigInteger(st.nextToken());
		BigInteger person = new BigInteger(st.nextToken());
		
		bw.write(money.divide(person) + "");
		bw.newLine();
		bw.write(money.remainder(person) + "");
		bw.flush();
		
	}
}
