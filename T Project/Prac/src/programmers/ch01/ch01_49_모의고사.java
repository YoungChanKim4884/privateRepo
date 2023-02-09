package programmers.ch01;

import java.util.ArrayList;

public class ch01_49_모의고사 {
    public int[] solution(int[] answers) {
        int[] d = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt = 1;
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();
        int[] a = new int[answers.length];
        for(int i=0; i<answers.length; i++){
            a[i] = cnt;
            cnt++;
            if(cnt==6){
                cnt = 1;
            }
        }
        cnt = 1;
        int[] b = new int[answers.length];
        for(int i=0; i<answers.length; i++){
            if(i%2==0){
                b[i] = 2;
            }else{
                b[i] = cnt;
                cnt++;
                if(cnt==2){
                    cnt++;
                }
                if(cnt==6){
                    cnt = 1;
                }
            }
        }
        int[] c = new int[answers.length];
        for(int i=0; i<answers.length; i++){
            c[i] = d[i%10];
        }
        arrList.add(0);
        arrList.add(0);
        arrList.add(0);
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a[i]){
                arrList.set(0, arrList.get(0)+1);
            }
            if(answers[i]==b[i]){
                arrList.set(1, arrList.get(1)+1);
            }
            if(answers[i]==c[i]){
                arrList.set(2, arrList.get(2)+1);
            }
        }
        cnt = 0;
        for(int i=0; i<arrList.size(); i++){
            for(int j=0; j<arrList.size(); j++){
                if(i==j){
                    continue;
                }
                if(arrList.get(i)>=arrList.get(j)){
                    cnt++;
                }
            }
            if(cnt==2){
                arrList2.add(i+1);
            }
            cnt = 0;
        }
        int[] answer = new int[arrList2.size()];
        for(int i=0; i<arrList2.size(); i++){
            answer[i] = arrList2.get(i);
        }
        
        return answer;
    }
}
