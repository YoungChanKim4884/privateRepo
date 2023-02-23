package programmers.ch01;

import java.util.Arrays;

public class ch01_69_둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] ch1 = new char[s.length()];
        char[] ch2 = new char[skip.length()];
        for(int i=0; i<ch2.length; i++){
            ch2[i] = skip.charAt(i);
        }
        Arrays.sort(ch2);
        for(int i=0; i<ch1.length; i++){
            ch1[i] = s.charAt(i);
            for(int j=0; j<index; j++){
                ch1[i]++;
                if(ch1[i]>'z'){
                    ch1[i]-=26;
                }
                for(int k=0; k<ch2.length; k++){
                    if(ch1[i]==ch2[k]){
                        ch1[i]++;
                        if(ch1[i]>'z'){
                            ch1[i]-=26;
                        }
                    }
                }
                for(int k=0; k<ch2.length; k++){
                    if(ch1[i]==ch2[k]){
                        ch1[i]++;
                        if(ch1[i]>'z'){
                            ch1[i]-=26;
                        }
                    }
                }
                
            }
            answer += ch1[i];
        }
        return answer;
    }
}