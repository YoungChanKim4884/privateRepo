package programmers.ch01;

import java.util.ArrayList;

public class ch01_53_n_1차다트게임 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        for(int i=0; i<answer.length; i++){
            answer[i] = i+1;
        }
        ArrayList<Double> failRate = new ArrayList<>();
        int cnt = 0;
        int user = stages.length;
        for(int i=1; i<=N; i++){
            for(int j=0; j<stages.length; j++){
                if(i>stages[j]){
                    continue;
                }else if(i==stages[j]){
                    cnt++;
                }
            }
            failRate.add((double)cnt / user);
            user -= cnt;
            cnt = 0;
        }
        double tmp = 0;
        for(int i=0; i<failRate.size(); i++){
            for(int j=0; j<failRate.size(); j++){
                if(i==j){continue;}
                if(failRate.get(i)>failRate.get(j)){
                    tmp = failRate.get(i);
                    failRate.set(i, failRate.get(j));
                    failRate.set(j, tmp);
                    tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = (int)tmp;
                }
            }
        }
        for(int i=0; i<failRate.size(); i++){
            for(int j=i+1; j<failRate.size(); j++){
                if(i==j){continue;}
                if(failRate.get(i).equals(failRate.get(j)) && answer[i]>answer[j]){
                // ArrayList에는 래퍼 클래스인 Double이 들어가기 때문에
                // == 연산자를 사용할 경우 인스턴스 값이 아닌 인스턴스의 주소 값을 비교한다.
                // == 연산자가 아닌 equals()로 값을 판별해야 한다.
                    tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = (int)tmp;
                }
            }
        }
        return answer;
    }
}
