package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze2_10813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] basket = new String[Integer.parseInt(st.nextToken())];
        int leng = Integer.parseInt(st.nextToken());
        for(int i=0; i<basket.length; i++){
            basket[i] = Integer.toString(i+1);
        }
        String tmp, a, b;
        for(int i=0; i<leng; i++){
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();
            tmp = basket[Integer.parseInt(a)-1];
            basket[Integer.parseInt(a)-1] = basket[Integer.parseInt(b)-1];
            basket[Integer.parseInt(b)-1] = tmp;
        }
        for(int i=0; i<basket.length; i++){
            bw.write(basket[i] + " ");
        }
        bw.flush();
    }
}
