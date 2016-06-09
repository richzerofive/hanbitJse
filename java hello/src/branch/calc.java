/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 *@date   : 2016. 6. 9.
 *@author : 박승주
 *@file   : clac.java
 *@story  : 
*/
public class calc {
	public static void main(String[] args) {
		//----------------init--------------------
		Scanner scanner = new Scanner(System.in);
		int num1=0,num2=0,numResult=0;
		String symbol1="",count="";
		//---------------op----------------------
		System.out.print("첫번째숫자:");
		num1=scanner.nextInt();
		System.out.print("연산자:");
		count = scanner.next();
		System.out.print("두번째숫자:");
		num2 =scanner.nextInt();
		switch (count) {
		case "+":
			symbol1 = "+";
			numResult= num1+num2;
			break;
		case "-":
			symbol1 = "-";
			numResult= num1-num2;
			break;
		case "*":
			symbol1 = "*";
			numResult= num1*num2;
			break;
		case "/":
			symbol1 = "/";
			numResult= num1/num2;
			break;
		case "%":
			symbol1 = "%";
			numResult= num1%num2;
			break;
		
		default:
			System.out.println("올바른 연산기호를 입력하세요");
			return;
		}
		System.out.println(num1+symbol1+num2+"="+numResult);
	}
}
