package baekjoon.bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class bronze5_8437 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        BigInteger apple = new BigInteger(br.readLine());
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger("2");
        
        BigInteger Julka = apple.subtract(a).divide(b);
        BigInteger Klaudia = Julka.add(a);
        
        bw.write(Klaudia + "");
        bw.newLine();
        bw.write(Julka + "");
        bw.flush();
	}
}
