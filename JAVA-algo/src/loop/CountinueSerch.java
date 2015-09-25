package loop;

import java.util.Scanner;

/**
 * 
 * @file_name  : CountinueSerch.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 9. 25.
 * @story      : countinue를 이용한 간단한 검색엔진 원리 이해
 */
public class CountinueSerch {
	/**
	 * 검색어 [동해]가 존재한는지 여부 체크
	 */
	public static void main(String[] args) {
		String dest = "동해물백두산";
		boolean isExist = false;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("검색어를 입력하세요.종료하려면 q를 입력하세요.");
			String searsh = scanner.next(); //백두
			if (searsh.equals("q")) {
				return;
			}
			isExist = false;
			int max = dest.length() - searsh.length(); //  검색어를 뺀 회전수는 의미없다.
			System.out.println(max);
			test:for (int i = 0; i <= max; i++) {
				int n =searsh.length(); // 
				int destStartPoint = i;  // 검색을 마친 후 다음 검색대상 낱말의 위치
				int searchStartPoint = 0;
			while (n-- !=0) {
				if (dest.charAt(destStartPoint++) != searsh.charAt(searchStartPoint++)) {
					continue test;
				}
			}
			isExist = true;
			break test;
				}
			System.out.println(isExist ? "검색어 ["+searsh+"]존재함"  : "존재하지 않음");	
		}
	}
}
/**
 * 29 : 문법 용어로 "라벨" 이라고 부르며, C언어의 GOTO문에 태그값에 해당한다. 
 * 41 : 삼항연산자 (조건문), ?  true : false ; => if else
 * 
*/
