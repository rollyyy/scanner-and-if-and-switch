package conditional_statement;

import java.util.Scanner;

public class B_ifElse {
	
	/* [if-else문 표현식]
	 * if(조건식) {
	 * 		조건식이 true일 때 실행할 명령문;
	 * } else {
	 * 		조건식이 false일 때 실행할 명령문;
	 * }
	 * => 조건을 만족하는지 여부에 따라 둘 중 하나는 무조건 실행해야하는 경우 많이 사용된다.
	 * */
	
	public void testSimpleIfElseStatement() {
		
		/* 정수 한 개를 입력 받아 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."라고 출력하고,
		 * 홀수가 아니면 "입력하신 숫자는 짝수입니다."라고 출력하는 프로그램을 작성해보자
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		/* 홀수인지 조건 확인 */
		if(num % 2 != 0) {
			/* 조건식이 참일 때 출력할 내용 */
			System.out.println("입력하신 정수는 홀수입니다.");
		} else {
			/* 조건식이 거짓일 때 출력할 내용 */
			System.out.println("입력하신 정수는 짝수입니다.");
		}
		
		/* 조건문과 상관 없이 출력할 내용 */
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void testNestedIfElseStatement() {
		
		/* 중첩된 if-else문 실행 흐름 확인 */
		/* if-else문 안에서 또 다른 조건을 사용하여 if-else문을 사용할 수 있다. */
		
		/* 숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 라고 출력하고,
		 * 음수이면 "입력하신 숫자는 음수입니다." 출력
		 * 단, 0이면 "0입니다"라고 출력하세요
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		/* 0인지 아닌지 조건 확인 */
		if(num != 0) {
			
			/* 0이 아닌 경우 양수인지 음수인지 조건 확인 */
			if(num > 0) {
				System.out.println("입력하신 숫자는 양수입니다.");
			} else {
				System.out.println("입력하신 숫자는 음수입니다.");
			}
			
		} else {
			/* 0인 경우 출력할 내용 */
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}