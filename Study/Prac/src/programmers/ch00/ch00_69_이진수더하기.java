package programmers.ch00;

public class ch00_69_이진수더하기 {
    public String solution(String bin1, String bin2) {
        String answer =  "" + Integer.toBinaryString((Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2)));
        return answer;
    }
}
