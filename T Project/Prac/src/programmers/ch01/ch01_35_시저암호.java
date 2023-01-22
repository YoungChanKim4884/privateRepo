package programmers.ch01;

public class ch01_35_시저암호 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arrChar = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            arrChar[i] = s.charAt(i);
        }
        int[] arrNum = new int[arrChar.length];
        for(int i=0; i<arrNum.length; i++){
            if((int)arrChar[i]==32){
                arrNum[i] = 32;
                continue;
            }
            arrNum[i] = (int)arrChar[i] + n;
            if((arrNum[i]>=123) || ((int)arrChar[i]<=90 && arrNum[i]>90)){
                arrNum[i] = arrNum[i] - 26;
            }
        }
        for(int i=0; i<arrNum.length; i++){
            if(arrNum[i]==32){
                arrChar[i] = ' ';
            }else{
                arrChar[i] = (char)arrNum[i];
            }
            answer = answer + arrChar[i];
        }
        return answer;
    }
}
