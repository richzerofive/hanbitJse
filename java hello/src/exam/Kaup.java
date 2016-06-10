/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : 박승주
 * @file : Kaup.java
 * @story : 카우푸지수 구하는 프로그램
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작의뢰입니다. 비만지수를 구하는 것인데요 키와 몸무게를 입력하면 당사자가 비만인지 저체중인지 알려주는 프로그램을
	 * 만들어 주세요 돈은 입금했습니다. 잘은 모르는데 kaup 공식을 쓰면 된다고 하네요. 공식은 나도 몰라요 알아서 하삼....
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int Wei = 0;
		double bmi = 0.0, Lth = 0.0;
		String name = "", ans = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("체중을 입력하세요");
		Wei = scanner.nextInt();
		System.out.println("키를 입력하세요");
		Lth = scanner.nextInt();

		Lth = Lth * 0.01;
		bmi = Wei / Lth / Lth;

		if (bmi < 18.5) {
			ans = "저체중";
		} else if (18.5 <= bmi && bmi < 23) {
			ans = "정상체중";
		} else if (23 <= bmi && bmi < 25) {
			ans = "위험체중";
		} else if (25 <= bmi && bmi < 30) {
			ans = "비만1단계";
		} else if (30 <= bmi && bmi < 40) {
			ans = "비만2단계";
		} else if (bmi >= 40) {
			ans = "비만3단계";
		} else
			ans = "키와몸무게를 확인해주세요";

		System.out.println("" + name + " 은 " + ans + "입니다.");

	}
}
