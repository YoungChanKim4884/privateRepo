package baekjoon.bronze.bronze3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze3_10810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int leng = Integer.parseInt(st.nextToken());
        for(int i=0; i<leng; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            for(int j=a; j<b; j++){
                basket[j] = c;
            }
        }
        
        for(int i=0; i<basket.length; i++){
            bw.write(basket[i] + " ");
        }
        
        bw.flush();
    }
}
