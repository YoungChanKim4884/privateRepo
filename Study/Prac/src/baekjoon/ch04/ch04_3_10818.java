package baekjoon.ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ch04_3_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int leng = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max = -1000000;
        int num = 0;
        for(int i=0; i<leng; i++){
            num = Integer.parseInt(st.nextToken());
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}
