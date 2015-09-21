package loop;

import java.util.Scanner;

/**
 * 
 * @file_name : ForLoopTenSum.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 1부터 10의 요소 합 구하기
 */
public class ForLoopTenSum {
	/**
	/**
	 * to 개발자님
	 * 교수님이 1부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다.
	 * 등차수열 1부터 10 요소의 합 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자를 입력하세요 : "); 
		int num = scanner.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i; // 기존 변수에 값을 누적시키는 연산자 +=, 감소시키는 연산자 -=
			/**
			 * sum = sum  + 1;
			 * sum = sum  + 2;
			 * sum = sum  + 3;.. 10바퀴 돈다.
			 * sum = sum  + 10;
			 */
		}
		System.out.print("숫자의 합 :" +sum);
	}

}
