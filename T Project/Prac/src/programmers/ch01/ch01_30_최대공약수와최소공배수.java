package programmers.ch01;

public class ch01_30_최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int max = 0;
        for(int i=1; i<=n && i<=m; i++){
			if(n%i==0 && m%i==0){
				max = i;
			}
		}		
		int min = (n * m) / max;
        int[] answer = {max, min};
        return answer;
    }
}
