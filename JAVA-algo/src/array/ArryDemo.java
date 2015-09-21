package array;
/**
 * 
 * @file_name : ArryDemo.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : Array 예제
 */
public class ArryDemo {
	public static void main(String[] args) {
		char[] arr;
		arr = new char[4];
		arr[0] = 'J';
		arr[1] = 'a';
		arr[2] = 'v';
		arr[3] = 'a';
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
