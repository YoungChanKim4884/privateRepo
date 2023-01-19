package programmers.ch01;

public class ch01_27 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(long i=1; i<=count; i++){
            sum = sum + (i * price);
            System.out.print(sum + ", ");
        }
        if(money-sum<0){
            answer = (money - sum) * (-1);
        }
        return answer;
    }
}
