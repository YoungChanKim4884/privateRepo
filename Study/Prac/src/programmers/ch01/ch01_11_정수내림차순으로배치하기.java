package programmers.ch01;

public class ch01_11_정수내림차순으로배치하기 {
    public long solution(long n) {
        String str = n + "";
        String tmp = "";
        long answer = 0;
        String[] str1 = str.split("");
        for(int i=0; i<str1.length-1; i++){
            for(int j=i+1; j<str1.length; j++){
                if(Long.parseLong(str1[i])<Long.parseLong(str1[j])){
                    tmp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = tmp;
                }
            }
        }
        for(int i=0; i<str1.length; i++){
            answer = answer + Long.parseLong(str1[i]);
            if(i!=str1.length-1){
                answer = answer * 10;
            }
        }
        return answer;
    }
}
