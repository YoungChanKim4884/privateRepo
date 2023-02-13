package programmers.ch00;

public class ch00_66_k의개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++){
            if(a<10){
                if(a==k){
                    answer++;
                }
            }else{
                String temp = Integer.toString(a);
                int[] digits = new int[temp.length()];
                for(int b=0; b<temp.length(); b++){
                    digits[b] = temp.charAt(b) - '0';
                }
                for(int b=0; b<digits.length; b++){
                    if(digits[b]==k){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
