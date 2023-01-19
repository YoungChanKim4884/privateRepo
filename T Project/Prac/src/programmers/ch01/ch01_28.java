package programmers.ch01;

public class ch01_28 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<=arr1.length-1; i++){
            for(int j=0; j<=arr1[i].length-1; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
