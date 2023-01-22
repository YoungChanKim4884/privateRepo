package programmers.ch01;

public class ch01_10_하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int A = 0;
        int B = x;
        for(int i=1; i<=5; i++){
            A = A + (B % 10);
            B = B / 10;
        }
        System.out.println(x%A);
        if(x%A!=0){
            answer = false;
        }
        return answer;
    }
}
