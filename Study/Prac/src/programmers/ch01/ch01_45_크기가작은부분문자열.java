package programmers.ch01;

public class ch01_45_크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        String[] str = new String[t.length()-p.length()+1];
        for(int i=0; i<str.length; i++){
            str[i] = t.substring(i, i+p.length());
            while(str[i].indexOf("0")==0 && str[i].length()!=1){
                str[i] = str[i].substring(1); 
            }
        }
        long[] num = new long[str.length];
        for(int i=0; i<num.length; i++){
            num[i] = Long.parseLong(str[i]);
            if(num[i]<=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
