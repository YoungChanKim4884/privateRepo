package jungsuk.ch03;

// 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
public class exercise3_8 {
	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
//		byte c = a + b;
		byte c = (byte)(a + b);
		// default가 int이기 때문에 형 변환을 해주어야 함
		
		char ch = 'A';
//		ch = ch + 2;
		ch = (char)(ch + 2);
		// 덧셈을 진행하며 int로 자동형변환이 이루어지기 때문에 char로 형 변환 시켜주어야 함
		
//		float f = 3 / 2;
		float f = 3 / 2f;
		// int끼리의 연산결과는 int이기 때문에 f를 붙여 float형으로 바꾸어 계산하여야 함
		
//		long l = 3000 * 3000 * 3000;
		long l = 3000 * 3000 * 3000L;
		// int끼리의 연산결과는 int이기 때문에 L을 붙여 long형으로 바꾸어 계산하여야 함
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = (float)d==f2;
		// 실수는 정수와 달리 근사값으로 표현을 하기 때문에
		// float를 double로 형변환했을 때 오차가 발생할 수 있다.
		// 때문에 double값을 유효자리수가 적은 float로 형변환해서 비교한다.
		
		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);
		
	}
}

// 실행결과
// c = 30
// ch = C
// f = 1.5
// l = 27000000000
// result = true