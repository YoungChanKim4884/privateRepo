package jungsuk.ch04;

// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
public class exercise4_3 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				sum += j;
			}
		}
		System.out.println("sum = " + sum);
		
//		int sum = 0;
//		int totalSum = 0;
//		for(int i=0; i<=10; i++) {
//			sum += i;
//			totalSum += sum;
//		}
//		System.out.println("totalSum = " + totalSum);
		
	}
}

// sum = 605