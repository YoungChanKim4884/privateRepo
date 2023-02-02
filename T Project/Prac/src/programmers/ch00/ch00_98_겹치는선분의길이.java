package programmers.ch00;

public class ch00_98_겹치는선분의길이 {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = lines[0][0];
        int max = lines[0][1];
        double T = 0;
        for(int i=1; i<=2; i++){
            if(lines[i][0]<min){
                min = lines[i][0];
            }
            if(lines[i][1]>max){
                max = lines[i][1];
            }
        }
        double[] tmp = new double[max - min];
        int[] tmp2 = new int[max - min];
        T = min + 0.5;
        for(int i=0; i<tmp.length; i++){
            tmp[i] = T++;
        }
        for(int i=0; i<=2; i++){
            for(int j=lines[i][0]; j<lines[i][1]; j++){
                for(int k=0; k<tmp.length; k++){
                    if(j+0.5==tmp[k]){
                        tmp2[k]++;
                    }
                }
            }
        }
        for(int i=0; i<tmp2.length; i++){
            if(tmp2[i]>=2){
                answer++;
            }
        }
        return answer;
    }
}
