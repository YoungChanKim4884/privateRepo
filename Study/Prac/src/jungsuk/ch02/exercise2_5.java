package jungsuk.ch02;

public class exercise2_5 {
	public static void main(String[] args) {
		
		// 다음 문장들의 출력결과를 적으세요.
		// 오류가 있는 문장의 경우, 괄호 안에 '오류' 라고 적으시오.
		
		System.out.println("1" + "2");
		// 12 (String)
		
		System.out.println(true + "");
		// true (String)
		
		System.out.println('A' + 'B');
		// 131 (65 + 66 = 131)(int)
		
		System.out.println('1' + 2);
		// 51 (49 + 2 = 51)(int)
		
		System.out.println('1' + '2');
		// 99 (49 + 50 = 99)(int)
		
		System.out.println('J' + "ava");
		// Java (String)
		
//		System.out.println(true + null);
		// 오류
		
	}
}
