package array;

import java.util.Scanner;

/**
 * 
 * @file_name : ArryTen.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : int 타입 배열 요소의 합
 */
public class ArryTen2 {
	/**
	 *  1부터 10까지의 합 구하기 (옵션 : 배열)
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] arr ={1,2,3,4,5};
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("점수 입력");
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
			
		}
	}





