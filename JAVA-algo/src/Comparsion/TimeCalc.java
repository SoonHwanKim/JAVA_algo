package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : TimeCalc.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 입력된 시간 (초)를 시간, 분, 초로 환산하기
 */
public class TimeCalc {
	/**
	 * To. 개발자님께
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 계속 수행해야 해서요.
	 * 혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을가요?
	 * 그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초 값을 입력하세요 : ");
		int sec = scanner.nextInt();
		int min = (int)(sec/60);
		int hour = (int)(min/60);
		int sec2  = (int)(sec%60);
		int min2 = (int)(min%60);
	System.out.println(sec+"초는 "+min+"분 "+hour+"시간이고 따라서 \n"+hour+"시간 "+min2+"분 "+sec2+"초");
	}

}
