package programmers.ch01;

public class ch01_60_기사단원의무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] numArr = new int[number];
        int cnt = 0;
        for(int i=1; i<=number; i++){
            for(int j=1; j*j<=i; j++){
                if(j * j==i){
                cnt++;
                }else if(i % j==0){
                cnt+=2;
                }
            }
            numArr[i-1] = cnt;
            cnt = 0;
        }
        for(int i=0; i<numArr.length; i++){
            if(numArr[i]>limit){
                numArr[i] = power;
            }
            answer += numArr[i];
        }
        return answer;
    }
}
