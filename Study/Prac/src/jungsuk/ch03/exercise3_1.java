package jungsuk.ch03;

// 다음 연산의 결과를 적으시오.
public class exercise3_1 {
	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		// 6
		/* 
		int는 32 bit이므로 33번 쉬프트 하지 않고 1번만 쉬프트
		3 << 1 == 6
		 */
		
		// true
		/* 
		true || false && false (|| 보다 && 우선 연산)
		true || false
		true
		 */
		
		// 13
		// 5
		// false
		// 2
		// 5
		// 66
		// B
		// B
		// C
		
	}
}
