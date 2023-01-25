package programmers.ch00;

public class ch00_71_7의개수 {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i<array.length; i++){
            String[] str = (Integer.toString(array[i])).split("");
            for(int j=0; j<str.length; j++){
                if(str[j].equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}
