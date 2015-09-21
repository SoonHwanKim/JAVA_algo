package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : SwitchTest3.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 18.
 * @story     :
 */
public class SwitchTest5 {
	/**
	 * To. 개발자님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
	 * 복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
	 * 몫과 나머지값으로 출력하면 된답니다.
	 * 출력결과물을 예를들어
	 * 5 + 5 = 10 이렇게 되고
	 * 10 / 3= 3[1] 나눗셈을 이렇게 나오면 된답니다.
	 * 그려면 []값이 나머지인지는 교수가 이미 알고 있겠답니다. 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.println("연산자를 입력하세요 : ");
		String opcode = scanner.next();
		System.out.println("숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();
		String opc = null;
		int res = 0;
		int res1 = 1;
		switch (opcode) {
		case "+": opc = "+"; res = num1 + num2;
		break;
		case "-": opc = "-"; res = num1 + num2;
		break;
		case "*": opc = "*"; res = num1 * num2;
		break;
		case "/": opc = "/"; res = num1 / num2; res1 = num1 % num2;
		System.out.println(num1 + opc + num2 + "=" + res + "["+res1+"]" );
		return;
		default:
			System.out.println("다시 입력하세요");
			break;
		}
		System.out.println(num1 + opc + num2 + "=" + res);

	}
}
