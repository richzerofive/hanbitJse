 /**
 * 
 */
package branch;

import java.util.Scanner;

import javax.swing.Spring;


/**
 * @date : 2016. 6. 9.
 * @author : 박승주
 * @file : MonthEnd.java
 * @story :
 */
public class MonthEnd {
	/**
	 *  월을 입력하면 말일이 몇일인지 알려주는
	 *  프로그램.
	 *  단, 2월은 29일로 한정함
	 *  1~12를 벗어난 숫자를 입력하면
	 *  잘못된 입력값입니다 라고 뜬다.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = 0 , monthResult = 0;
		String mon = "";
		
		System.out.println("월을 입력하세요");
		month=scanner.nextInt();
		switch (month) {
		case 1:
			monthResult = 31;
			break;
		case 2:
			monthResult = 29;
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
