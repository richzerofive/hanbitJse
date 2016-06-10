/**
 * 
 */
package exam;

import java.util.Scanner;

import javax.swing.Spring;


/**
 * @date : 2016. 6. 9.
 * @author : 박승주
 * @file : MonthEnd.java
 * @story :
 */
public class MonthEnd2 {
	/**
	 *  년, 월을 입력하면 말일이 몇일인지 알려주는
	 *  프로그램.
	 *  단, 윤년 2월은 29일이고, 너머지 해는 28일로 마감입니다.
	 *  1~12를 벗어난 숫자를 입력하면
	 *  잘못된 입력값입니다 라고 뜬다.
	 * */
	/**
	 * 윤년의 조건
	 * 연도를 4로 나눈값이 0이라면 윤년일 수 있다
	 * 그러나 해당 연수가 100으로 나눠 떨어지면 평년이다.
	 * 2000년은 4로 나눈값이 0이라서 윤년의 조건은 되는데
	 * 다시 이 값이 100으로 나눠 떨어지기 때문에 평년이 되었다.
	 * 평년이라해도 다시 400으로 나눠떨어지는 년도는 윤년이다.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int monthResult = 0;
		String mon = "";
		System.out.println("년을 입력하세요(예)2016");
		int year=2016;
		System.out.println("월을 입력하세요(예)2");
		int month=2;
		switch (month) {
		case 1:
			monthResult = 31;
			break;
		case 2:
			if (year%4==0||year%4%400==0) {
				monthResult = 29;
			} else {
				monthResult = 28;
			}
						break;
		case 3:
			monthResult=31;
			break;
		case 4:
			monthResult=30;
			break;
		case 5:
			monthResult=31;
			break;
		case 6:
			monthResult=31;
			break;
		case 7:
			monthResult=30;
			break;
		case 8:
			monthResult=31;
			break;
		case 9:
			monthResult=30;
			break;
		case 10:
			monthResult=31;
			break;
		case 11:
			monthResult=30;
			break;
		case 12:
			monthResult=31;
			break;
		default:
			System.out.println("정확한달을 입력하세요");
			return;
					}
		System.out.println(month=monthResult);
		
		
		
	}
}
