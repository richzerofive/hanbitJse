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
		int avg=0,hong=0,kim=0,kg=0;
		String ans="",name="";
		
	
	System.out.println("이름을 입력해주세요");	
		name=scanner.next();		
	System.out.println("홍길동점수입력");
		hong=scanner.nextInt();
	System.out.println("김유신점수입력");
	    kim=scanner.nextInt();
	System.out.println("김구점수입력");
		kg=scanner.nextInt();
	
	switch (avg) {
	case 1: 
		ans = "1등입니다";
		break;
	case 2: 
		ans = "2등입니다";
		break;
	case 3: 
		ans = "3등입니다";
		break;

	default:
		System.out.println("다시 입력해주세요");
		return;
	}
		System.out.println();
		
	}
}
