/**
 * 
 */
package arr;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * @date : 2016. 6. 9.
 * @author : 박승주
 * @file : Num1.java
 * @story :
 */
public class arrbase2 {
	/**
	 * 저희 반은 학생수가 3명입니다. 학생의 평균점수는 0~100점사이입니다. 3명의 평균점수를 입력하면 1등 홍길동 2등 김유신 3등
	 * 김구 이렇게 나오도록 해주세요 단, 학생이름은 스캐너로 입력받습니다. 홍길동 49 김유신 78 김구 96 ======== 1등 김구
	 * 96점 2등 김유신 78점 3등 홍길동 49점 ===============
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] avg = new int[3];
		int i =0;
		int[] gradeA = new int[3];
		
		String[] name = new String[3];
		
		String[] grade = new String[3];
		
		
		avg[0] = scanner.nextInt();
		System.out.println("이름,점수");
		name[1] = scanner.next();
		avg[1] = scanner.nextInt();
		System.out.println("이름,점수를 입력해주세요");
		name[2] = scanner.next();
		avg[2] = scanner.nextInt();
		for (; i < avg.length; i++) {System.out.println("이름,점수");
			name[i]=scanner.next();
			avg[i] = scanner.nextInt();
		}
		if (avg[0] > avg[1] && avg[0] > avg[2]) {
			grade[0] = name[0];
			gradeA[0] = avg[0];
			if (avg[1] > avg[2]) {
				grade[1] = name[1];
				gradeA[1] = avg[1];
				grade[2] = name[2];
				gradeA[2] = avg[2];
			}
			{}
			 grade[2] = name[1];
				gradeA[2] = avg[1];
				grade[1] = name[2];
				gradeA[1] = avg[2];
			
		}
		if (avg[1] > avg[2]) {
			grade[0] = name[0];
			gradeA[1] = avg[1];
			if (avg[0] > avg[2]) {
				grade[1] = name[1];
				gradeA[1] = avg[1];
				grade[2] = name[2];
				gradeA[2] = avg[2];
			} else {
				grade[2] = name[2];
				gradeA[0] = avg[0];
				grade[2] = name[2];
				gradeA[0] = avg[0];
			}
		} else {
			grade[0] = name[2];
			gradeA[1] = avg[2];
			if (avg[0] > avg[1]) {
				grade[1] = name[1];
				gradeA[0] = avg[0];
				grade[2] = name[0];
				gradeA[2] = avg[1];
			} else {
				grade[1] = name[0];
				gradeA[0] = avg[1];
				grade[2] = name[1];
				gradeA[2] = avg[0];
			}
		}
		System.out.printf(" 1 등 : %s의 점수는 %d\n ", grade[0], gradeA[0]);
		System.out.printf(" 2 등 : %s의 점수는 %d\n ", grade[1], gradeA[1]);
		System.out.printf(" 3 등 : %s의 점수는 %d\n ", grade[2], gradeA[2]);
	}
}