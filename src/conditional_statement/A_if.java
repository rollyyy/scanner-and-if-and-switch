package conditional_statement;

import java.util.Scanner;

public class A_if {
	
	/* [if문 표현식]
	 * if(조건식) {
	 * 		조건식이 true일 때 실행할 명령문;
	 * }
	 * => 조건을 만족하는 경우에만 추가적인 명령을 실행시키고자 할 때 주로 사용한다.
	 * */
	
	public void testSimpleIfStatement() {
		
		/* 정수 한 개를 입력 받아 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력하고,
		 * 짝수가 아니면 출력하지 않는 구문을 작성해보자
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개를 입력하세요 : ");
		int num = sc.nextInt();
		
		/* 짝수인지 물어보는 조건을 기술함
		 * 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수이다. 즉 2의 배수이다. */
		if(num % 2 == 0) {
			/* 조건식 부분에 작성한 내용이 true일 때는 해당 내용을 실행하고
			 * false일 때는 if블럭 전체를 무시하고 실행하게 된다. */
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		/* 조건문과 상관 없이 실행하는 구문 */
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void testNestedIfStatement() {
		
		/* 중첩된 if문 실행 흐름 확인 */
		/* if문 안에서 또 다른 조건을 사용하여 if문을 사용할 수 있다. */
		
		/* 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
		 * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다."라고 출력하고
		 * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		/* 양수인지 조건 확인 */
		if(num > 0) {
			
			/* 양수가 맞는 경우 다시 한 번 더 짝수인지 조건을 확인함 */
			if(num % 2 == 0) {
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
