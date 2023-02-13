package programmers.ch01;

public class ch01_7_문자열내p와y의개수 {
    boolean solution(String s) {
		boolean answer = true;
        
        String S = s.toUpperCase();
        String[] S1 = S.split("");

        int P = 0;
        int Y = 0;
        
        for(int i=0; i<=S1.length-1; i++){
            if(S1[i].equals("P")){
                P++;
            }else if(S1[i].equals("Y")){
                Y++;
            }
        }
        
        if(P!=Y){
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}
