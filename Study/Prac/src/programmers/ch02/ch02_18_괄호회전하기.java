package programmers.ch02;

import java.util.ArrayList;

public class ch02_18_괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        int[] num = {0, 0, 0};
        ArrayList<Integer> cnt1 = new ArrayList<>();
        ArrayList<Integer> cnt2 = new ArrayList<>();
        ArrayList<Integer> cnt3 = new ArrayList<>();
        int cnt4 = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='('){
                    num[0]++;
                    cnt1.add(j);
                }else if(s.charAt(j)==')' && cnt1.size()>0 && (j-cnt1.get(cnt1.size()-1))%2==1){
                    num[0]--;
                    cnt1.remove(cnt1.size()-1);
                    if(num[0]<0){
                        break;
                    }
                }
                else if(s.charAt(j)=='{'){
                    num[1]++;
                    cnt2.add(j);
                }else if(s.charAt(j)=='}' && cnt2.size()>0 && (j-cnt2.get(cnt2.size()-1))%2==1){
                    num[1]--;
                    cnt2.remove(cnt2.size()-1);
                    if(num[1]<0){
                        break;
                    }
                }
                else if(s.charAt(j)=='['){
                    num[2]++;
                    cnt3.add(j);
                }else if(s.charAt(j)==']' && cnt3.size()>0 && (j-cnt3.get(cnt3.size()-1))%2==1){
                    num[2]--;
                    cnt3.remove(cnt3.size()-1);
                    if(num[2]<0){
                        break;
                    }
                }else{
                    cnt4++;
                }
            }
            if(num[0]==0 && num[1]==0 && num[2]==0 && cnt4==0){
                answer++;
            }
            cnt4 = 0;
            num[0] = 0;
            num[1] = 0;
            num[2] = 0;
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
}
