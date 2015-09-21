package loop;

import java.util.Scanner;

/**
 * 
 * @file_name : ForLoopTenSum.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 입력한 값과 값사이의 요소 합 구하기
 */
public class ForLoopTenSum2 {
	/**
	/**
	 * to 개발자님
	 * 교수님이 1부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다.
	 * 그런데, 교수님이 까다로워서 큰 수를 먼저 입력하든
	 * 나중에 입력하든 두 수 사이의 정수들의 합을 나오게 해달랍니다.
	 * [결과]
	 * 5부터 137 까지의 합은 ??? 입니다
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input1= 0, input2=0, sum=0, small=0, big=0;
		System.out.println("숫자를 입력하세요 : ");
		input1 = scanner.nextInt();
		input2 = scanner.nextInt(); // 숫자 사이의 서열정리
		//System.out.println("숫자를 입력하세요 : "); 
		//int num2 = scanner.nextInt();
			if (input1 < input2) {
				small = input1;
				big = input2;
			}else{
				small = input2;
				big = input1;
			}
			for (int i = small; i <= big; i++) { // 이 문제에서는 limit 값 까지의 합이니까
			sum += i; // 기존 변수에 값을 누적시키는 연산자 +=, 감소시키는 연산자 -=
			/**
			 * sum = sum  + 1;
			 * sum = sum  + 2;
			 * sum = sum  + 3;.. 10바퀴 돈다.
			 * sum = sum  + 10;
			 */
		}
		System.out.print(small+"부터"+big+"까지의 합은" +sum+ "입니다.");
	}

}
