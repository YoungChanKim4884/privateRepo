package programmers.ch01;

import java.util.ArrayList;

public class ch01_66_카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        ArrayList<String> card1 = new ArrayList<>();
        ArrayList<String> card2 = new ArrayList<>();
        for(int i=0; i<cards1.length; i++){
            card1.add(cards1[i]);
        }
        for(int i=0; i<cards2.length; i++){
            card2.add(cards2[i]);
        }
        for(int i=0; i<goal.length; i++){
            if(card1.size()>0 && goal[i].equals(card1.get(0))){
                card1.remove(0);
            }else if(card2.size()>0 && goal[i].equals(card2.get(0))){
                card2.remove(0);
            }else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
