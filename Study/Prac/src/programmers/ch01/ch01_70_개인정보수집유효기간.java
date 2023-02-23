package programmers.ch01;

import java.util.ArrayList;

public class ch01_70_개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> al = new ArrayList<>();
        today = today.replace(".", "");
        int today1 = Integer.parseInt(today);
        for(int i=0; i<privacies.length; i++){
            String[] dateT = privacies[i].substring(0, 10).replace(".", " ").split(" ");
            int[] date = new int[dateT.length];
            for(int j=0; j<date.length; j++){
                date[j] = Integer.parseInt(dateT[j]);
            }
            for(int j=0; j<terms.length; j++){
                String[] str = terms[j].split(" ");
                if(privacies[i].charAt(11)==terms[j].charAt(0)){
                    date[1] = date[1] + (Integer.parseInt(str[1]));
                    if(date[1]>=13){
                        date[1] -= 12;
                        date[0] += 1;
                    }
                }
            }
            while(true){
                if(date[1]>=13){
                    date[1] -= 12;
                    date[0] += 1;
                }
                if(date[1]<13){
                    break;
                }
            }
            date[2] -= 1;
            if(date[2]<=0){
                date[2] += 28;
                date[1] -= 1;
            }
            if(date[1]<=0){
                date[1] += 12;
                date[0] -= 1;
            }
            
            int cnt = date[0] * 10000 + date[1] * 100 + date[2];
            if(today1>cnt){
                al.add(i+1);
            }
        }
        int[] answer = new int[al.size()];
        for(int i=0; i<al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}