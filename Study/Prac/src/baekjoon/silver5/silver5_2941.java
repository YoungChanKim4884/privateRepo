package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class silver5_2941 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        
        str = str.replace("c=", "1").replace("c-", "2").replace("dz=", "3").replace("d-", "4").replace("lj", "5").replace("nj", "6").replace("s=", "7").replace("z=", "8");
        bw.write("" + str.length());
        bw.flush();
	}
}
