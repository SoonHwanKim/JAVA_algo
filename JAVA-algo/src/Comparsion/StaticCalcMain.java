package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : StaticCalc.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 18.
 * @story     : 스태틱을 만든 사칙연산기
 */
public class StaticCalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요 : ");
		
		StaticCalc calc = new StaticCalc();
	//	calc.plus(scanner.nextInt(), scanner.nextInt()); 인스턴스 방식으로 접근해서 경고메시지 발생
		System.out.println(StaticCalc.plus(scanner.nextInt(), scanner.nextInt()));

	}
}
class StaticCalc{
	static int result = 0; // 맴버변수 중에서 클래스 변수
	public static int plus(int a, int b){ //매개 변수 = 파라미터 = 매변, 다만 파라미터는 초기화할 필요가 없다.
		int result = 0; // 지역변수 = 로컬변수 =>매개 변수... 반드시 초기화 해야 한다.
		result = a + b;
	//	return a + b; 
		return result;
	}
	public static int mius(int a, int b){
		return a - b; 
	}
	public static int multi(int a, int b){
		return a * b; 
	}
	public static int divide(int a, int b){
		return a / b; 
	}
	
	
	
	

}