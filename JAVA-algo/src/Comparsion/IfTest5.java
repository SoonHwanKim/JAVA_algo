package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : IfTest5.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 18.
 * @story     : if-else 로 ssn 성별 분석하기
 */
public class IfTest5 {
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
		 * String ssn = sscanner.next()
		 * char ch = ssn.charAt(); // 몇번째자리의 숫자 출력
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String hong = scanner.next();
		System.out.println("주민번호 입력 : ");
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		String s = null;
		if(ch == '0' || ch == '7' || ch=='8' ||ch == '9') {
			System.out.println("다시 입력하세요.");
			}
			else if(ch == 1 || ch == 3){
				s="남자";
			}
			else if(ch == '2' || ch == '4'){
				s="여자";
			}
			else{
				s="외국인";
			}
		System.out.println(hong + ssn+ s);
		} 
	}



