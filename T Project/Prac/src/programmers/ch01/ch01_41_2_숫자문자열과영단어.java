package programmers.ch01;

public class ch01_41_2_숫자문자열과영단어 {
	public int solution(String s) {
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i], ""+i);
        }

        return Integer.parseInt(s);
    }
}
