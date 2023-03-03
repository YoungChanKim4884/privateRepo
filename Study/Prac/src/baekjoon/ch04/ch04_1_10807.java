package baekjoon.ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//import java.util.Scanner;

public class ch04_1_10807 {
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] A = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<A.length; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int C = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]==C){
                cnt++;
            }
            
        }
        bw.write(cnt + "");
        bw.flush();
    	
//        Scanner sc = new Scanner(System.in);
//        int[] A = new int[sc.nextInt()];
//        for(int i=0; i<A.length; i++){
//            A[i] = sc.nextInt();
//        }
//        int C = sc.nextInt();
//        int cnt = 0;
//        for(int i=0; i<A.length; i++){
//            if(A[i]==C){
//                cnt++;
//            }
//        }
//        System.out.print(cnt);
    }
}
