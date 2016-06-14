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
 * @story : 1등을 출력하시오
 */
public class Mn1 {
	/**
	 * 학생수는 입력받습니다 학생을 점수만 입력해서 최고점과 최저점만 출력하는 로직을 작성하시오 ======== 1등 김구 96점 2등
	 * 김유신 78점 3등 홍길동 49점 ===============
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0, i = 0, maxi = 0, mini = 100,count = 0;

		System.out.println("학생수");
		number = scanner.nextInt();
		int[] score = new int[number];
	

		System.out.println("점수입력");
		for (; i < count; i++) {
			score[i] = scanner.nextInt();
			if (i > i - 1)
				maxi = i;
			else if (i < i - 1)
				mini = i;
		}

		System.out.printf("최고점 : %d 최저점 : %d", maxi, mini);
	}
}