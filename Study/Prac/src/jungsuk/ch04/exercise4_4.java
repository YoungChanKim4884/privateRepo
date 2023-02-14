package jungsuk.ch04;

// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
public class exercise4_4 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		int s = 1;
		while(sum<100) {
			num++;
			sum += num * s;
			s *= -1;
		}
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
		
	}
}

// 실행결과
// num = 199
// sum = 100