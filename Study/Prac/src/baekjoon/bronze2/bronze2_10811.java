package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze2_10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int leng = Integer.parseInt(st.nextToken());
        for(int i=0; i<basket.length; i++){
            basket[i] = i+1;
        }
        int start, end, tmp;
        for(int i=0; i<leng; i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            for(int j=start-1, k=end-1; j<k; j++, k--) {
                tmp = basket[j];
                basket[j] = basket[k];
                basket[k] = tmp;
            }
        }
        for(int i=0; i<basket.length; i++){
            bw.write(basket[i] + " ");
        }
        bw.flush();
    }
}
