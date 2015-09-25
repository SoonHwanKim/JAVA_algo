package array;

import java.util.Scanner;

/**
 * 
 * @file_name : Money.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화페 단위별로 분류시키는 문제
 */
public class Money2 {
	/**
	 * 예를 들어서 134,530이면
	 * 거스름돈을 화페로 표시해주면 5만원 : 2, 1만원 : 3
	 * 표시하고 10원 미만은 절삭
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		int[] moneyUnlt ={50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] moneyNum	= new int[moneyUnlt.length];
		
		for (int i = 0; i < moneyUnlt.length; i++) {
			moneyNum[i] = money / moneyUnlt[i];
			money = money % moneyUnlt[i];
			System.out.println(moneyUnlt[i]+"원 : " + moneyNum[i]);
			
		}
		}
	
	}

/**
 * 25 : moneyUnit[0] = 5만원권, 전체금액을 5만원권으로 나눈 몫을 구한다.
 */
 
