/**
 * 
 */
package branch;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 *@date   : 2016. 6. 9.
 *@author : 박승주
 *@file   : Num1.java
 *@story  : 
*/
public class Num1 {
	/**
	 * 저희 반은 학생수가 3명입니다.
	 * 학생의 평균점수는 0~100점사이입니다.
	 * 3명의 평균점수를 입력하면
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * 홍길동
	 * 49
	 * 김유신
	 * 78
	 * 김구
	 * 96
	 * ========
	 * 1등 김구 96점
	 * 2등 김유신 78점
	 * 3등 홍길동 49점
	 * ===============
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int avg=0,hong=0;
		String ans1="",name="",ans2="",ans3="";
		
	
	System.out.println("첫번째 이름을 입력해주세요");	
		name=scanner.next();
		System.out.println("두번째 이름을 입력해주세요");	
		name=scanner.next();
		System.out.println("셋번째 이름을 입력해주세요");	
		name=scanner.next();
	System.out.println("점수를 입력해주세요");
		hong=scanner.nextInt();

		if (avg==10) {
			System.out.println("입력된 정수값"+avg+"은 10입니다");
		} else {
	System.out.println("입력된 정수값"+avg+"이 10이 아닙니다");
		}
	}}
