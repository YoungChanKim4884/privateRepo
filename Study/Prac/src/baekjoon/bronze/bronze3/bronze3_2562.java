package baekjoon.bronze.bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bronze3_2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = 0;
        int leng = 0;
        int num;
        for(int i=1; i<=9; i++){
            num = Integer.parseInt(br.readLine());
            if(max<num){
                max = num;
                leng = i;
            }
        }
        bw.write(Integer.toString(max));
        bw.newLine();
        bw.write(Integer.toString(leng));
        bw.flush();
    }
}
