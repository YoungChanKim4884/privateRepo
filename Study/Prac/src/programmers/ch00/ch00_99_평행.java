package programmers.ch00;

public class ch00_99_평행 {
    public int solution(int[][] dots) {
        int answer = 0;
        double slope1 = 0;
        double slope2 = 0;
        slope1 = ((double)dots[0][1] - (double)dots[1][1]) / ((double)dots[0][0] - (double)dots[1][0]);
        slope2 = ((double)dots[2][1] - (double)dots[3][1]) / ((double)dots[2][0] - (double)dots[3][0]);
        System.out.println(slope1 + ", " + slope2);
        if(slope1==slope2){
            answer = 1;
        }
        slope1 = ((double)dots[0][1] - (double)dots[2][1]) / ((double)dots[0][0] - (double)dots[2][0]);
        slope2 = ((double)dots[1][1] - (double)dots[3][1]) / ((double)dots[1][0] - (double)dots[3][0]);
        System.out.println(slope1 + ", " + slope2);
        if(slope1==slope2){
            answer = 1;
        }
        slope1 = ((double)dots[0][1] - (double)dots[3][1]) / ((double)dots[0][0] - (double)dots[3][0]);
        slope2 = ((double)dots[1][1] - (double)dots[2][1]) / ((double)dots[1][0] - (double)dots[2][0]);
        System.out.println(slope1 + ", " + slope2);
        if(slope1==slope2){
            answer = 1;
        }
        return answer;
    }
}
