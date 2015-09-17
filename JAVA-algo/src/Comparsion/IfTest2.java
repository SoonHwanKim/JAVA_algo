package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : IfTest2.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 17.
 * @story     :
 */
public class IfTest2 {
	/**
	 * To. 개발자님 프로그램을 하나 개발해야 합니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 교수는 학생 평균을 입력하면 등수을 알려주는 기능을 추가해 달랍니다.
	 * 오더는 다음과 같이 화면에 출력 하라고 합니다
	 * 1등 : 김유신
	 * 단 학생은 총 3명입니다. 그리고 평균점수는 0 이상 100 이하입니다.
	 * 교수가 실수로 120점이라든지 하는 범위 밖 점수를 입력하면
	 * "다시 입력하세요" 라고 알려주시길 바랍니다.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		String kim = scanner.next();
		System.out.println("이름 입력");
		String hong = scanner.next();
		System.out.println("이름 입력");
		String yee = scanner.next();
		System.out.println("평균 입력");
		int ave = scanner.nextInt();
		System.out.println("평균 입력");
		int ave1 = scanner.nextInt();
		System.out.println("평균 입력");
		int ave2 = scanner.nextInt();
		
		if(ave>100 || ave<0 || ave1>100 || ave1<0 || ave2>100 || ave2<0){
			System.out.println("다시입력하세요.");
		}
		else if(ave>ave2 && ave>ave2) {
			System.out.println("1등 : " + kim);
		}
		else if(ave1>ave2){
			System.out.println("1등 : " + hong);
		}else{
			System.out.println("1등 : " + yee);
	}

 }
}