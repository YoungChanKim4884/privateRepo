package programmers.ch00;

import java.util.ArrayList;
import java.util.Arrays;

public class ch00_72_소인수분해 {
    public int[] solution(int n) {
        ArrayList<Integer> arrList1 = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(n%i==0){
                arrList1.add(i);
                n = n / i;
                i--;
            }
        }
        int[] arr = new int[arrList1.size()];
        for(int i=0; i<arrList1.size(); i++){
            arr[i] = arrList1.get(i);
        }
        int[] answer = Arrays.stream(arr).distinct().toArray();
        return answer;
    }
}
