package baekjoon.bronze2;

import java.util.ArrayList;
import java.util.Scanner;

public class bronze2_3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<10; i++){
            int num = sc.nextInt() % 42;
            int cnt = 0;
            for(int j=0; j<arr.size(); j++){
                if(arr.get(j).equals(num)){
                    cnt++;
                }
            }
            if(cnt==0){
                arr.add(num);
            }else{
                cnt = 0;
            }
        }
        System.out.print(arr.size());
    }
}
