package jungsuk.ch02;

public class exercise2_9 {
	public static void main(String[] args) {
		
		// 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		// a. b = (byte)i;
		// b. ch = (char)b;
		// c. short s = (short)ch;
		// d. float f = (float)l;
		// e. i = (int)ch;
		
		// d, e
		
		// a : int(4byte) -> byte(1byte) 형 변환 필요
		// b : byte(1byte) -> char(2byte) 범위가 다르기 때문에 형 변환 필요
		// c : char(2byte) -> short(2byte) 범위가 다르기 때문에 형 변환 필요
		
	}
}
