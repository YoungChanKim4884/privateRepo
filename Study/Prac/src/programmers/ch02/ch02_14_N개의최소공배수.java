package programmers.ch02;

public class ch02_14_N개의최소공배수 {
    public int solution(int[] arr) {
        int max = 0;
        int a = arr[0];
        int b = 0;
        for(int i=1; i<arr.length; i++){
            b = arr[i];
            for(int j=1; j<=a && j<=b; j++){
                if(a%j==0 && b%j==0){
                    max = j;
                }
            }
            a = (a * b) / max;
        }
        return a;
    }
}
