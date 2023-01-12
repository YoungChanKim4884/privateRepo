package programmers.ch01;

public class ch01_16 {
    public int[] solution(int[] arr, int divisor) {
        int num = 0;
        int num2 = 0;
        int tmp = 0;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]%divisor==0){
                num++;
            }
        }
        int[] answer = new int[num];
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]%divisor==0){
                answer[num2] = arr[i];
                num2++;
            }
        }
        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i]>answer[j]){
                    tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }
        if(answer.length==0){
            answer = new int[1];
            answer[0] = -1;
        }
        System.out.print(answer.length);

        return answer;
    }
}
