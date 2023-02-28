package programmers.ch02;

import java.util.ArrayList;

public class ch02_19_1차캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 5;
        int cnt = 0;
        int cnt2 = 0;
        ArrayList<String> cache = new ArrayList<>();
        for(int i=0; i<cities.length; i++){
            cities[i] = cities[i].toLowerCase();
        }
        if(cacheSize!=0){
            cache.add(cities[0]);
        }else{
            return answer * cities.length;
        }
        for(int i=1; i<cities.length; i++){
            for(int j=0; j<cache.size(); j++){
                if(cities[i].equals(cache.get(j))){
                    cnt++;
                    cnt2 = j;
                }
            }
            if(cnt==0){
                answer+=5;
                if(cache.size()==cacheSize){
                    cache.remove(0);
                    cache.add(cities[i]);
                }else{
                    cache.add(cities[i]);
                }
            }else{
                answer++;
                if(cache.size()==cacheSize){
                    cache.remove(cnt2);
                    cache.add(cities[i]);
                }else{
                    cache.add(cities[i]);
                }
            }
            cnt = 0;
            cnt2 = 0;
        }
        return answer;
    }
}
