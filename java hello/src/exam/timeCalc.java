/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 *@date   : 2016. 6. 10.
 *@author : 박승주
 *@file   : timeCalc.java
 *@story  : 초를 가지고 시간 분 초로 환산하기
*/
public class timeCalc {
	/**
	 * 개발자님...
	 * 타이머로 작업시간을 기록하고 있는데요
	 * 결과가 50000초로 나오네요
	 * 그런데 이게 감이 잘 안와서요..
	 * 시간,분,초로 나누어서 보게 해주세요
	 * 예를 들면 50000초가 입력되면
	 * 25시간 32분 15초 이렇게 보이게 해주세요
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hh=0, mm=0, ss=0;
		
		System.out.println("초를 입력");
		ss=scanner.nextInt();
		
		hh=ss/60/60;
		mm=ss/60%60;
		ss=ss%60;
		
		System.out.println(""+hh+"시간+ "+mm+"분 +"+ss+"초");
	}
}
