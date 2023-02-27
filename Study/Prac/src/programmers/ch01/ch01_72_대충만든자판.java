package programmers.ch01;

public class ch01_72_대충만든자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int[26];
        for(int i=0; i<alphabet.length; i++){
            alphabet[i] = 101;
        }
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                if(alphabet[keymap[i].charAt(j)-65] >= j+1){
                    alphabet[keymap[i].charAt(j)-65] = j+1;
                }
            }
        }
        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length(); j++){
                if(alphabet[targets[i].charAt(j)-65]!=101){
                    answer[i] += alphabet[targets[i].charAt(j)-65];
                }else{
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}