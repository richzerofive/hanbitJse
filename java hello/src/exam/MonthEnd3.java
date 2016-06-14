/**
 * 
 */
package exam;

import java.util.Scanner;

import javax.swing.Spring;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

/**
 * @date : 2016. 6. 9.
 * @author : 박승주
 * @file : MonthEnd.java
 * @story :
 */
public class MonthEnd3 {
	/**
	 * 년, 월을 입력하면 말일이 몇일인지 알려주는 프로그램. 단, 윤년 2월은 29일이고, 너머지 해는 28일로 마감입니다. 1~12를
	 * 벗어난 숫자를 입력하면 잘못된 입력값입니다 라고 뜬다.
	 */
	/**
	 * 윤년의 조건 연도를 4로 나눈값이 0이라면 윤년일 수 있다 그러나 해당 연수가 100으로 나눠 떨어지면 평년이다. 2000년은 4로
	 * 나눈값이 0이라서 윤년의 조건은 되는데 다시 이 값이 100으로 나눠 떨어지기 때문에 평년이 되었다. 평년이라해도 다시 400으로
	 * 나눠떨어지는 년도는 윤년이다.
	 * 사막연산자=()?:;
	 * System.out.printf("%d%s%d%s%d%s",year,"년"month,"월",day,"일");
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month=0, year=0, day=0, MonthResult=0;
		
		
		System.out.println("연도");
		year=scanner.nextInt();
		System.out.println("월");
		month=scanner.nextInt();
		switch (month) {
		case 1: case 3: case 5: case 6 : case 8 : case 10 : case 12:;
			MonthResult = 31;
			break;
		case 2: 
			MonthResult = (year % 4 == 0 || year % 100 != 0 && year % 400 == 0)?29:28; 
			break;
			
		case 4: case 7: case 9: case 11:;
			MonthResult = 30;
		
			break;
		default:
			break;
		}
		System.out.printf("%d%s%d%s%d%s", year,"년",month,"월", MonthResult, "일");
		

		
		
	}
}	
