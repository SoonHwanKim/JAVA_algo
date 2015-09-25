package loop;

import java.util.Scanner;

/**
 * 
 * @file_name  : Gugudan.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 25.
 * @story      : 구구단 프로그램
 */
public class GugudanWhatsDan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요 :");
		int dan = scanner.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println( dan +"*" +i + "=" +dan*i);
			
		}
	}
	
	

}
