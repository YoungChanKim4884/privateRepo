package programmers.ch01;

public class ch01_11_n {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        String[] str1 = str.split("");
        String tmp;
        String str2 = "";
        for(int i=0; i<=str1.length-2; i++){
            for(int j=i+1; j<=str1.length-1; j++){
                if(Integer.parseInt(str1[i])<Integer.parseInt(str1[j])){
                    tmp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = tmp;
                }
            }
        }
        for (int i=0; i<=str1.length-1; i++){
            str2 = str2 + str1[i];
        }
        answer = Integer.parseInt(str2);
        return answer;
    }
}
