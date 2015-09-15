package Hello;

import java.util.Scanner;
/**
 * @file_name : Name.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 15.
 * @story     : 인풋, 아웃풋 이벤트
 */
public class Name {
	public static void main(String[] args) {
		String name = "성함이 무엇입니까?";
		System.out.println(name);
		Scanner scanner = new Scanner(System.in);
		String hi = scanner.next();
		System.out.println(hi);
	}

}
