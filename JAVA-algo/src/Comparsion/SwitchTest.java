package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : SwitchTest.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 18.
 * @story     : switch로 성별 판별 프로그램
 */
public class SwitchTest {
	 /**
	 * To. 개발자님 프로그램을 하나 개발해야 합니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 교수가 주민번호를 입력하면 해당 학생이 남자인지 여자인지 외국인인지
	 * 자동으로 출력 해준느 프로그램을 만들어 달랍니다.
	 * 오더는 다음과 같이 화면에 출력 하라고 합니다
	 * 홍길동 : 800101-1234567 : 남
	 * 입렵랎은 이름과 주민번호이고 남은 자동으로 출력되는 값입니다.
	 * 현행법상 1, 3 으로 시작되면 남자, 2,4로 시작되면 여자, 5,6이면 외국인
	 * 교수가 실수로 0, 7, 8, 9점 로 시작 주민번호를 입력하면
	 * "다시 입력하세요" 라고 알려주시길 바랍니다.
	 * */
		public static void main(String[] args) {
			/**
			 * 표기법 (notation)
			 * 정수 타입 표기법 : 1, 2, 3...
			 * 실수 타입 표기법 : 1.0, 2.0, 3,0...
			 * 문자 타입 표기법 : '1', '2', '3'...
			 * 문자열 타입 표기법 : "1", "2", "3"...
			 *  
			 */
			Scanner scanner = new Scanner(System.in);
			System.out.println("이름 입력 : ");
			String hong = scanner.next();
			System.out.println("주민번호 입력 : ");
			String ssn = scanner.next();
			char ch = ssn.charAt(7);
			String s = null;
			switch (ch){
			case '1':case '3':s="남자";
			case '2':case '4':s="여자";
			case '5':case '6':s="외국인";
			default: 
				System.out.println("다시 입력하세요.");
				return;
			}
		}
}

			
		


