package programmers.ch02;

public class ch02_11_카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        double br = brown;
        double ye = yellow;
        double s = br + ye;
        double b = ye-s-4;
        double aa = (((-1)*b) + Math.sqrt((b*b) - (16*s))) / 4;
        double bb = (((-1)*b) - Math.sqrt((b*b) - (16*s))) / 4;
        if(aa>bb){
            answer[0] = (int)aa;
            answer[1] = (int)bb;
        }else{
            answer[0] = (int)bb;
            answer[1] = (int)aa;
        }
        return answer;
    }
}
