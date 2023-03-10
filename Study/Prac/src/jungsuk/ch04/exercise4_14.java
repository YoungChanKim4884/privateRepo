package jungsuk.ch04;

// 다음은 숫자맞추기 게임을 작성한 것이다.
// 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
// 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
// (1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
public class exercise4_14 {
	public static void main(String[] args) {
		
//		int answer = /* (1)알맞은 코드를 넣어 완성하시오 */;
		int answer = (int)(Math.random() * 100) + 1;
		
		int input = 0;
		int count = 0;
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt();
			
			/* (2)알맞은 코드를 넣어 완성하시오 */
			if(answer>input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;
			}
			
		}while(true);
	}
}

// 실행결과
// 1과 100사이의 값을 입력하세요 : 
// 50
// 더 작은 수를 입력하세요.
// 1과 100사이의 값을 입력하세요 : 
// 10
// 더 큰 수를 입력하세요.
// 1과 100사이의 값을 입력하세요 : 
// 15
// 맞췄습니다.
// 시도횟수는 3번 입니다.