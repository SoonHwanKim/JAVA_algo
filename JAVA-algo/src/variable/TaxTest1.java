package variable;

import java.util.Scanner;

public class TaxTest1 {
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
		// 지역변수 초기화 : 변수값에 그 타입에 맞는 기본값을 할당하는 것
		// 단 스캐너로 입력받을 시 생략 가능
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scanner.next();
		System.out.println("연봉 입력");
		int money = scanner.nextInt();
		int tex = (int) (money * 0.110); // (다운)캐스팅
		System.out.println("연봉 "+money+"만원을 받으시는 "+name+"님께서 납부할 세금은 "+tex+"만원 입니다.");
		 
	}
}
