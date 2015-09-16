package operator;
/**
 * 
 * @file_name : UnaryTest.java
 * @author    : sevuo@naver.com
 * @date      : 2015. 9. 16.
 * @story     : 단항연산자 예제
 */
public class UnaryTest {
	public static void main(String[] args) {
		/**
		 * 문제 : 정수형 변수 x=5, y=10, z=0 일때 
		 */
		int x = 5, y = 10, z = 0;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(y++);
		z = x++ + ++x + y++;
		//z= X후위 + x전위 + y후위 식을 연산자를 사용해서 완성하고
		//z의 결과값을 출력하시오. 그리고 그 이유를 설명하시오.
		System.out.println("z의  결과값은? : "+z);
		System.out.println("그 이유는 " );
		
		
	}

}
