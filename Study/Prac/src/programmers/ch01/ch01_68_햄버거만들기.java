package programmers.ch01;

import java.util.ArrayList;

public class ch01_68_햄버거만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> ingred = new ArrayList<>();
        int j = 0;
        int k = 0;
        for(int i=0; i<ingredient.length; i++){
            ingred.add(ingredient[j]);
            j++;
            if(ingred.size()<4){
                continue;
            }else{
                k = ingred.size();
                if(ingred.get(k-1).equals(1) && ingred.get(k-2).equals(3) && ingred.get(k-3).equals(2) && ingred.get(k-4).equals(1)){
                    ingred.remove(k-1);
                    ingred.remove(k-2);
                    ingred.remove(k-3);
                    ingred.remove(k-4);
                    answer++;
                }
            }
        }
        return answer;
    }
}
