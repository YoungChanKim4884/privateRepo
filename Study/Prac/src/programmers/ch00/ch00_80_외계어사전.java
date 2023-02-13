package programmers.ch00;

public class ch00_80_외계어사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<dic.length; i++){
            String[] str = dic[i].split("");
            if(spell.length!=str.length){
                continue;
            }else{
                for(int j=0; j<spell.length; j++){
                    for(int k=0; k<str.length; k++){
                        if(spell[j].equals(str[k])){
                            cnt1++;
                        }
                    }
                    if(cnt1==1){
                        cnt2++;
                    }
                    cnt1 = 0;
                }
                if(cnt2==spell.length){
                    answer = 1;
                }
                cnt2 = 0;
            }
        }
        return answer;
    }
}
