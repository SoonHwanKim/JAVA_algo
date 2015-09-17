package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : Switch.java
 * @author    : 김찬호
 * @date      : 2015. 9. 17.
 * @story     : 스위치 문법
 */
public class Switch3 {
	/**
	 * 월을 입력하면 해당 월이 몇일까지 인지
	 * 알려주는 프로그램을 작성하시오.
	 * 단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
	 */
	public static void main(String[] args) {
		//int month = Integer.parseInt("2");
		//리터럴 : 정수리터럴, 문자리터럴, 문자열리터럴
		//System.out.println(month);
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("월을 입력하세요");
		//month = scanner.nextInt();
		//String res = null;//지역변수는 반드시 초기호를 해 주어야 한다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = scanner.nextInt();
		String res = null;
		//필터링
		//유효성 체크 validation
		if (month>12) {
			System.out.println("존재하지 않습니다.");
		}
		else if (month<1) {
			System.out.println("존재하지 않습니다.");
		}
		else{
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			res = "31일 까지 입니다."; break;
		case 4:case 6:case 9:case 11:
			res ="30일 까지 입니다."; break;
		case 2:
			res = "29일 까지 입니다."; break;
		default:
			System.out.println("");
		}
		System.out.println(month+"월은" +res);
		}
	}
}

		
	
