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
		int avg1=0,avg2=0,avg3=0,gradeA1=0,gradeA2=0,gradeA3=0;
		String name1="",name2="",name3="",grade1="",grade2="",grade3="";
		
	
	System.out.println("이름,점수");	
		name1=scanner.next();
		avg1=scanner.nextInt();
	System.out.println("이름,점수");
		name2=scanner.next();
		avg2=scanner.nextInt();
		System.out.println("이름,점수를 입력해주세요");
		name3=scanner.next();
		avg3=scanner.nextInt();
		
		
		if (avg1 > avg2 && avg1 > avg3) {
			grade1 = name1;
			gradeA1 = avg1;
			 if(avg2 > avg3) {
				grade2 = "name2";
				gradeA2 = avg2;
				grade3 = "name3";
				gradeA3 = avg3;
			}  {
				grade2 = "name3";
				gradeA2 = avg3;
				grade3 = "name2";
				gradeA3 = avg2;
			}
		}   if (avg2 > avg3) {
			grade1 = "name2";
			gradeA1 = avg2;
			if (avg1 > avg3) {
				grade2 = "name1";
				gradeA2 = avg1;
				grade3 = "name3";
				gradeA3 = avg3;
			} else {
				grade2 = "name3";
				gradeA2 = avg3;
				grade3 = "name1";
				gradeA3 = avg1;
			}
		} else {
			grade1 = "name3";
			gradeA1 = avg3;
			 if(avg1 > avg2) {
				grade2 = "name1";
				gradeA2 = avg1;
				grade3 = "name2";
				gradeA3 = avg2;
			} else  {
				grade2 = "name2";
				gradeA2 = avg2;
				grade3 = "name1";
				gradeA3 = avg1;
			}
		}
		
		System.out.printf(" 1 등 : %의 점수는 % D \n ", grade1, gradeA1);
		System.out.printf(" 1 등 : %의 점수는 % D \n ", grade1, gradeA1);
		System.out.printf(" 1 등 : %의 점수는 % D \n ", grade1, gradeA1);
	}}
		