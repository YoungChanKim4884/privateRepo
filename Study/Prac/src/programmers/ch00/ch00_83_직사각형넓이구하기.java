package programmers.ch00;

public class ch00_83_직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int a = 0;
        int b = 0;
        int tmp = 0;
        for(int i=0; i<dots.length-1; i++){
            for(int j=i+1; j<dots.length; j++){
                if(dots[i][0]>dots[j][0]){
                    tmp = dots[i][0];
                    dots[i][0] = dots[j][0];
                    dots[j][0] = tmp;
                }
                if(dots[i][1]>dots[j][1]){
                    tmp = dots[i][1];
                    dots[i][1] = dots[j][1];
                    dots[j][1] = tmp;
                }
            }
        }
        a = dots[dots.length-1][0] - dots[0][0];
        b = dots[dots.length-1][1] - dots[0][1];
        int answer = a * b;
        return answer;
    }
}
