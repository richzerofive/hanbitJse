/**
 * 
 */
package Controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 14.
 * @author : 박승주
 * @file : Controller.java
 * @story :
 */
public class Controller {
	public static void main(String[] args) {
		String menu = "";
		Scanner s = new Scanner(System.in);
		Clac calc = new Clac();
		Kaup kaup = new Kaup();
		MonthEnd end = new MonthEnd();
		Num1 out = new Num1();
		Mn1 mn1 = new Mn1();
		Tax tax = new Tax();
		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기" + "2.카우푸" + "3.년월말" + "4.1등구하기" + "5.학번/나이" + "6.최고최저점수"
					+ "7.세금액" + "8.성별판별" + "9.시분초구하기" + "0.종료");
			switch (menu) {
			case "1":
				System.out.print("첫번째숫자 : ");
				System.out.print("연산자 : ");
				System.out.print("두번째숫자 : ");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":
				System.out.println("이름?");
				System.out.println("키?");
				System.out.println("몸무게?");
				System.out.println(kaup.execute(s.next(), s.nextDouble(), s.nextDouble()));
				;
				break;
			case "3":
				System.out.println("년을 입력하세요(예)2016");
				System.out.println("월");
				System.out.println(end.execute(s.nextInt(), s.nextInt()));
				break;
			case "4":
				System.out.println("이름,점수");
				System.out.println("이름,점수");
				System.out.println("이름,점수");
				System.out.println(out.execute(s.next(), s.nextInt(), s.next(), s.nextInt(), s.next(), s.nextInt()));
			case "6":
				
				System.out.println("학생수");
				int count = s.nextInt();
				System.out.println("점수입력");
				int[] score = new int[count];
				for (int i=0; i < count; i++) {
					score[i] = s.nextInt();
				}
				System.out.println(mn1.execute(score));

			case "7":
				System.out.println("이름을 입력하세요");
				int change=0;
				System.out.println("연봉을 입력하세요");
				System.out.println("세율이 바뀌었습니까?" + "그대로이면 1, 바뀌었으면 2 를 입력하세요");
				int change2 = 0; Double taxRate = 0.0;
				if (change==1) {
					taxRate = 0.097;
				} else {
					System.out.println("그럼, 바뀐세율을 입력바랍니다");
					taxRate = s.nextDouble();
				System.out.println(tax.execute(taxRate));}
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			default:
				JOptionPane.showMessageDialog(null, "메뉴에 없는 번호입니다");}
		}}
}
			
			
		


	
