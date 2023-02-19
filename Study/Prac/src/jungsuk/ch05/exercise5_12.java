package jungsuk.ch05;

import java.util.Scanner;

// 예제5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
public class exercise5_12 {
	public static void main(String[] args) {
		
		String[][] words = {{"chair", "의자"},		// words[0][0], words[0][1]
		{"computer", "컴퓨터"},		// words[1][0], words[1][1]
		{"integer", "정수"}};		// words[2][0], words[2][1]
		int cnt = 0;
		
		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);

			String tmp = scanner.nextLine();

			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.");
				System.out.println();
				cnt++;
			} else {
			   System.out.printf("틀렸습니다. 정답은 %s입니다.", words[i][1]);
			   System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("전체 " + words.length + "문제 중 " + cnt + "문제 맞추셨습니다.");

	}
}

// 실행결과
// Q1. chair의 뜻은? dmlwk
// 틀렸습니다. 정답은 의자입니다.
// Q2. computer의 뜻은? 컴퓨터
// 정답입니다.
// Q3. integer의 뜻은? 정수
// 정답입니다.
// 
// 전체 3문제 중 2문제 맞추셨습니다.