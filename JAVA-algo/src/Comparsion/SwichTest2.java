package Comparsion;

import java.util.Scanner;

/**
 * 
 * @file_name : SwichTest2.java
 * @author : sevuo@naver.com
 * @date : 2015. 9. 18.
 * @story :
 */
public class SwichTest2 {
	/**
	 * To. 개발자님 프로그램을 하나 개발해야 합니다. 오더는 다음과 같이 화면에 출력하라고 합니다. 교수는 학생과 국어, 영어,
	 * 수학점수만 입력하면 총점, 평균, 합격여부가 출력되는 프로그램입니다. 학생 국어 영어 수학 총점 평균 합격여부
	 * =========================================================================
	 * ===== 홍길동 90 90 90 270 90 (장학생) 합격여부는 다음과 같다고 합니다. 평균 90점 이상이면 장학생 70점 이상
	 * 90미만 이면 합격 70미만이면 불합격 이라고 하네요. 단 평균에서 소수점이하는 절삭입니다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생이름 : ");
		String name = scanner.next();
		System.out.println("국어 점수 :");
		int kor = scanner.nextInt();
		System.out.println("영어 점수 :");
		int eng = scanner.nextInt();
		System.out.println("수학 점수 :");
		int math = scanner.nextInt();
		int tal = kor + eng + math;
		int avg = tal / 3;
		String result = null;
		int gijun = avg / 10;
		switch (gijun) {
		case 9:
		case 10:
			result = "장학생";
		case 7:
		case 8:
			result = "합격";
		default:
			result  = "불합격";
		}
		System.out.println("학생		국어		영어		수학		총점		평균		합격여부");
		System.out.println("==========================================================================================");
		//System.out.println(name+"\t\t"+kor+"\t\t"+eng+"\t\t"+math+"\t\t"+tal+"\t\t"+avg+"\t\t"+ result);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%s", name,kor,eng,math,tal,avg,result);
	}

}
