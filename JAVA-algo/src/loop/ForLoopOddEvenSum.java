package loop;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 
 * @file_name : ForLoopOddEvenSum.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 등차수열 입력한 값과 값사이의 요소의 홀수합, 짝수합 따로 구하기
 *  */
public class ForLoopOddEvenSum {
	/**
	/**
	 * 입력받은 두개의 수 범위 값 중에서
	 * 짝수의 합, 홀수의 합을 따로 츌려하세요.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input1= 0, input2=0, sum=0, small=0, big=0, odd=0, even=0;
		System.out.println("숫자를 입력하세요 : ");
		input1 = scanner.nextInt();
		input2 = scanner.nextInt(); // 숫자 사이의 서열정리
		//System.out.println("숫자를 입력하세요 : "); 
		//int num2 = scanner.nextInt();
			if (small % 2 == 0) {
				for (int j = small; j <= big; j+=2) {
					even += j;
				}
				for (int j = small+1; j <= big; j+=2) {
					odd += j;
				}
				}else{
					for (int j = small; j <= big; j+=2) {
						even += j;
					}
					for (int j = small+1; j <= big; j+=2) {
						odd += j;
					}
		}
			System.out.println(small + "부터"+big+"까지 짝수의 합 :" +even);
			System.out.println(small + "부터"+big+"까지 홀수의 합 :" +odd);
	}
}


			/**
			 * sum = sum  + 1;
			 * sum = sum  + 2;
			 * sum = sum  + 3;.. 10바퀴 돈다.
			 * sum = sum  + 10;			 * 
			 */

	

