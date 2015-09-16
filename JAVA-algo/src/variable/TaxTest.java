package variable;

import java.util.Scanner;

/**
 * 
 * @file_name : TaxTest.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 세금 출력 프로그램
 */
public class TaxTest {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력 받아서
	 * 연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원 입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔때 마다 변하니,
	 * 관리자가 쉽게 적용 가능하도록 만들어 주세요.
	 * 현 정권의 세율이 9.7프로라고 합니다.
	 */
	public static void main(String[] args) {
		final double TXE_RATE = 0.097;
		int salary;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scanner.next();
		System.out.println("연봉을 입력하세요");
		salary = scanner.nextInt();
	//	tax = (int) (salary * TXE_RATE);
		System.out.println("연봉 "+salary+" 만원을 받으시는 " +name +"님 납부할 세금은"+(int) (salary * TXE_RATE)+"만원입니다");
		
		
		
		
	}
}
