package Comparsion;

/**
 * 
 * @file_name : SearchTest.java
 * @author : sevuo@naver.com
 * @date : 2015. 9. 25.
 * @story : 특정 글자의 갯수 구하기
 */
public class SearchTest {
	/**
	 * [결과] "p는 8개로 존재합니다."로 출력됨
	 */
	public static void main(String[] args) {
		String dest = "peter plper picked a peck of pickled peperes";
		int pCount = 0;
		for (int i = 0; i < dest.length(); i++) {

			if ('p' == dest.charAt(i)) {
				pCount++;

			}

		}
		System.out.println("제시된 문자열에서 p는" + pCount + "게 존재합니다.");
	}

}
