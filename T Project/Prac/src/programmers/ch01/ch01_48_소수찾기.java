package programmers.ch01;

public class ch01_48_소수찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean[] sosu =new boolean [n+1];

        for(int i=2; i<=n ; i++){
        	// 2~n번째 수를 true로 초기화
            sosu[i]=true;
        }

        // 제곱근 구하기 
        int root=(int)Math.sqrt(n);

        // 2~sqrt(n)까지 검사
        for(int i=2; i<=root; i++){
        	// i번째의 수가 소수일 경우
            if(sosu[i]==true){
            	// sosu[i]의 배수들을 false로 초기화
                for(int j=i; i*j<=n; j++){
                    sosu[i*j]=false;
                }
            }      
        }
        for(int i =2; i<=n; i++)  { 
            if(sosu[i]==true){
                answer++;
            }
        }
        return answer;
    }
}
