package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : LeapYear.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 윤년 판별 프로그램
 */
public class LeapYear {
	/**
	 * 연도를 4로 나눈값이 0이라면 윤년일 수 있다.
	 * 그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
	 * 2000년은 4로 나눈값이 0이라서 윤년일수 있는데...
	 * 다시 이 값이 100으로 나눠 떨어지면 평년이다.
	 * 평년이라 해도 다 400으로 나눠 떨어지는 연도는 윤년이다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year=0;
		String foo = null;
		System.out.println("년도를 입력 하세요");
		year =scanner.nextInt();
		/**
		 * 필터링 if문에서 차례대로 연산식을 거쳐 참 거짓을 판별하면서
		 * 하부로 값을 전달하는 행위.
		 * 필터링 방식은 결과값을 크게 주는 범위부터 작은 방향으로 진행함
		 * 
		 */
		if (year%400 == 0) {
			foo = "윤년";
		} else if (year%100 == 0) {
			foo = "평년";
		} else if (year%4 == 0) {
			foo = "윤년";
		}else {
			foo ="평년";
		}
		System.out.println(year+"년도는 : "+ foo);
	}

}
