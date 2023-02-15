package programmers.ch01;

public class ch01_56_로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int cnt = 7;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                    cnt--;
                    continue;
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i]==win_nums[j]){
                        cnt--;
                        continue;
                    }
                }
            }
        }
        if(cnt==7){
            cnt = 6;
        }
        int cnt2 = 7;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                    continue;
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i]==win_nums[j]){
                        cnt2--;
                        continue;
                    }
                }
            }
        }
        if(cnt2==7){
            cnt2 = 6;
        }
        int[] answer = {cnt, cnt2};
        return answer;
    }
}
